package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.Usuario;
import com.zealepsoluciones.nutricionbackend.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> Usuarios = usuarioService.findAll();
        return ResponseEntity.ok(Usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        Usuario Usuario = usuarioService.findById(id);
        if (Usuario != null) {
            return ResponseEntity.ok(Usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario createdUsuario = usuarioService.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<Usuario> getUsuarioByUsername(@PathVariable String username) {
        Usuario Usuario = usuarioService.findByUsername(username);
        if (Usuario != null) {
            return ResponseEntity.ok(Usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
