package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.ComposicionAlimento;
import com.zealepsoluciones.nutricionbackend.service.ComposicionAlimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/composicion-alimento")
@RequiredArgsConstructor
public class ComposicionAlimentoController {

    private final ComposicionAlimentoService composicionAlimentoService;
    @PostMapping
    public ResponseEntity<ComposicionAlimento> create(@RequestBody ComposicionAlimento t) {
        return ResponseEntity.ok(composicionAlimentoService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<ComposicionAlimento>> list() {
        return ResponseEntity.ok(composicionAlimentoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComposicionAlimento> findById(@PathVariable Long id) {
        return ResponseEntity.ok(composicionAlimentoService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        composicionAlimentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}