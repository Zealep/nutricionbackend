package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.Evaluacion;
import com.zealepsoluciones.nutricionbackend.model.entity.Medicamentos;
import com.zealepsoluciones.nutricionbackend.service.MedicamentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")
@RequiredArgsConstructor
public class MedicamentosController {
    private final MedicamentosService medicamentosService;

    @PostMapping
    public ResponseEntity<Medicamentos> create(@RequestBody Medicamentos t) {
        return ResponseEntity.ok(medicamentosService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<Medicamentos>> list() {
        return ResponseEntity.ok(medicamentosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicamentos> findById(@PathVariable Long id) {
        return ResponseEntity.ok(medicamentosService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        medicamentosService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
