package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Evaluacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EvaluacionRepository extends CrudRepository<Evaluacion, Long> {
    List<Evaluacion> findByActivo(Boolean activo);

}
