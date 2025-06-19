package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Patologias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatologiasRepository extends CrudRepository<Patologias, Long> {
    List<Patologias> findByActivo(Boolean activo);
}
