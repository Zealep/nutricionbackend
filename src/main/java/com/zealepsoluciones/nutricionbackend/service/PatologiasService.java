package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Patologias;

import java.util.List;

public interface PatologiasService {
    Patologias save(Patologias t);
    void deleteById(Long id);
    List<Patologias> findAll();
    Patologias findById(Long id);
}
