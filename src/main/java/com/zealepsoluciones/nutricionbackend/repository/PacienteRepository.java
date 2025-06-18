package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {
    List<Paciente> findByActivo(Boolean activo);
}
