package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Alergias;
import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;

import java.util.List;

public interface AlergiasService {
    Alergias save(Alergias t);
    void deleteById(Long id);
    List<Alergias> findAll();
    Alergias findById(Long id);
}
