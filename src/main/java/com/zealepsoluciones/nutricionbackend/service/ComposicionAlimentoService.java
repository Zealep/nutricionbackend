package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.ComposicionAlimento;

import java.util.List;

public interface ComposicionAlimentoService {
    ComposicionAlimento save(ComposicionAlimento t);
    void deleteById(Long id);
    List<ComposicionAlimento> findAll();
    ComposicionAlimento findById(Long id);
}
