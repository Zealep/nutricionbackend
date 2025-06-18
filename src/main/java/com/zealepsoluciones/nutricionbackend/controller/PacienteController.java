package com.zealepsoluciones.nutricionbackend.controller;
import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;
import com.zealepsoluciones.nutricionbackend.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> create(@RequestBody Paciente t) {
        return ResponseEntity.ok(pacienteService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> list() {
        return ResponseEntity.ok(pacienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> findById(@PathVariable Long id) {
        return ResponseEntity.ok(pacienteService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        pacienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

