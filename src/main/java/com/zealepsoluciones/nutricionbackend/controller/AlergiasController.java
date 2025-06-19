package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.model.entity.Alergias;
import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;
import com.zealepsoluciones.nutricionbackend.service.AlergiasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alergias")
@RequiredArgsConstructor
public class AlergiasController {

    private final AlergiasService alergiasService;

    @PostMapping
    public ResponseEntity<Alergias> create(@RequestBody Alergias t) {
        return ResponseEntity.ok(alergiasService.save(t));
    }

    @GetMapping
    public ResponseEntity<List<Alergias>> list() {
        return ResponseEntity.ok(alergiasService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alergias> findById(@PathVariable Long id) {
        return ResponseEntity.ok(alergiasService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        alergiasService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
