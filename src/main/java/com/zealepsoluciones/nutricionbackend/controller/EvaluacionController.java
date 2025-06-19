package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.ComposicionAlimento;
import com.zealepsoluciones.nutricionbackend.model.entity.Evaluacion;
import com.zealepsoluciones.nutricionbackend.service.EvaluacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluacion")
@RequiredArgsConstructor
public class EvaluacionController {
    private final EvaluacionService evaluacionService;

    @PostMapping
    public ResponseEntity<Evaluacion> create(@RequestBody Evaluacion t) {
        return ResponseEntity.ok(evaluacionService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<Evaluacion>> list() {
        return ResponseEntity.ok(evaluacionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evaluacion> findById(@PathVariable Long id) {
        return ResponseEntity.ok(evaluacionService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        evaluacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
