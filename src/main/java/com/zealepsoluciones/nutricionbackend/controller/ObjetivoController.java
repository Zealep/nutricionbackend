package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.Menu;
import com.zealepsoluciones.nutricionbackend.model.entity.Objetivo;
import com.zealepsoluciones.nutricionbackend.service.ObjetivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/objetivos")
@RequiredArgsConstructor
public class ObjetivoController {
    private final ObjetivoService objetivoService;
    @PostMapping
    public ResponseEntity<Objetivo> create(@RequestBody Objetivo t) {
        return ResponseEntity.ok(objetivoService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<Objetivo>> list() {
        return ResponseEntity.ok(objetivoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Objetivo> findById(@PathVariable Long id) {
        return ResponseEntity.ok(objetivoService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        objetivoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
