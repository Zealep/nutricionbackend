package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.Menu;
import com.zealepsoluciones.nutricionbackend.model.entity.Patologias;
import com.zealepsoluciones.nutricionbackend.service.PatologiasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patologias")
@RequiredArgsConstructor
public class PatologiasController {
    private final PatologiasService patologiasService;
    @PostMapping
    public ResponseEntity<Patologias> create(@RequestBody Patologias t) {
        return ResponseEntity.ok(patologiasService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<Patologias>> list() {
        return ResponseEntity.ok(patologiasService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patologias> findById(@PathVariable Long id) {
        return ResponseEntity.ok(patologiasService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        patologiasService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
