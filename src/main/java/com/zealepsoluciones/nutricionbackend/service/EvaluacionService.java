package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Evaluacion;

import java.util.List;

public interface EvaluacionService {
    Evaluacion save(Evaluacion t);
    void deleteById(Long id);
    List<Evaluacion> findAll();
    Evaluacion findById(Long id);
}
