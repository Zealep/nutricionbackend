package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;
import java.util.List;
import java.util.Optional;

public interface PacienteService {
    Paciente save(Paciente t);
    void deleteById(Long id);
    List<Paciente> findAll();
    Paciente findById(Long id);
}
