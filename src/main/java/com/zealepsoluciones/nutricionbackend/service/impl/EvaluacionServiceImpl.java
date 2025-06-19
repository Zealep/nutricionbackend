package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.Evaluacion;
import com.zealepsoluciones.nutricionbackend.repository.EvaluacionRepository;
import com.zealepsoluciones.nutricionbackend.service.EvaluacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EvaluacionServiceImpl implements EvaluacionService {

    private final EvaluacionRepository evaluacionRepository;

    @Override
    public Evaluacion save(Evaluacion t) {
        t.setActivo(true);
        return evaluacionRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Evaluacion e = this.findById(id);
        if (e != null) {
            e.setActivo(false);
            evaluacionRepository.save(e);
        }
    }

    @Override
    public List<Evaluacion> findAll() {
        return evaluacionRepository.findByActivo(true);
    }

    @Override
    public Evaluacion findById(Long id) {
        return evaluacionRepository.findById(id).orElse(null);
    }
}
