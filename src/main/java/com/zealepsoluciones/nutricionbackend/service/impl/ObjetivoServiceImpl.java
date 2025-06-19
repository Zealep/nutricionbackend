package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.Objetivo;
import com.zealepsoluciones.nutricionbackend.repository.ObjetivoRepository;
import com.zealepsoluciones.nutricionbackend.service.ObjetivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjetivoServiceImpl implements ObjetivoService {
    private final ObjetivoRepository objetivoRepository;

    @Override
    public Objetivo save(Objetivo t) {
        t.setActivo(true);
        return objetivoRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Objetivo objetivo = this.findById(id);
        if (objetivo != null) {
            objetivo.setActivo(false);
            objetivoRepository.save(objetivo);
        }
    }

    @Override
    public List<Objetivo> findAll() {
        return objetivoRepository.findByActivo(true);
    }

    @Override
    public Objetivo findById(Long id) {
        return objetivoRepository.findById(id).orElse(null);
    }
}
