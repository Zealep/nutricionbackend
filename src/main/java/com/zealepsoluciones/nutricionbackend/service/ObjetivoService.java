package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Objetivo;

import java.util.List;

public interface ObjetivoService {
    Objetivo save(Objetivo t);
    void deleteById(Long id);
    List<Objetivo> findAll();
    Objetivo findById(Long id);
}
