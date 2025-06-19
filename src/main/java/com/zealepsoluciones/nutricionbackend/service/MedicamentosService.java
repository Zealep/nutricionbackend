package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Medicamentos;

import java.util.List;

public interface MedicamentosService {
    Medicamentos save(Medicamentos t);
    void deleteById(Long id);
    List<Medicamentos> findAll();
    Medicamentos findById(Long id);
}
