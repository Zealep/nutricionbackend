package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;
import com.zealepsoluciones.nutricionbackend.repository.PacienteRepository;
import com.zealepsoluciones.nutricionbackend.service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;


    @Override
    public Paciente save(Paciente t) {
        t.setActivo(true);
        return pacienteRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Paciente t = findById(id);
        if (t != null) {
            t.setActivo(false);
            pacienteRepository.save(t);
        }
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findByActivo(true);
    }

    @Override
    public Paciente findById(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }
}

