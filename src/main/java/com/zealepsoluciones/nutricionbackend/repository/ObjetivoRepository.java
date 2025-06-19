package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Objetivo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ObjetivoRepository extends CrudRepository<Objetivo, Long> {
    List<Objetivo> findByActivo(Boolean activo);
}
