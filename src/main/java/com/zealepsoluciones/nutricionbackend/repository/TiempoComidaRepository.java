package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.TiempoComida;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TiempoComidaRepository extends CrudRepository<TiempoComida, Long> {
    List<TiempoComida> findByActivo(Boolean activo);
}
