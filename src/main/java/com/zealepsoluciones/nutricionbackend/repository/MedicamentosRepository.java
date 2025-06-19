package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Medicamentos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicamentosRepository extends CrudRepository<Medicamentos, Long> {
    List<Medicamentos> findByActivo(Boolean activo);
}
