package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Patologias;
import com.zealepsoluciones.nutricionbackend.model.entity.TiempoComida;

import java.util.List;

public interface TiempoComidaService {
    TiempoComida save(TiempoComida t);
    void deleteById(Long id);
    List<TiempoComida> findAll();
    TiempoComida findById(Long id);
}
