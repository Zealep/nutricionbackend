package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.Patologias;
import com.zealepsoluciones.nutricionbackend.model.entity.TiempoComida;
import com.zealepsoluciones.nutricionbackend.service.TiempoComidaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tiempo-comidas")
@RequiredArgsConstructor
public class TiempoComidaController {
    private final TiempoComidaService tiempoComidaService;
    @PostMapping
    public ResponseEntity<TiempoComida> create(@RequestBody TiempoComida t) {
        return ResponseEntity.ok(tiempoComidaService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<TiempoComida>> list() {
        return ResponseEntity.ok(tiempoComidaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiempoComida> findById(@PathVariable Long id) {
        return ResponseEntity.ok(tiempoComidaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tiempoComidaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
