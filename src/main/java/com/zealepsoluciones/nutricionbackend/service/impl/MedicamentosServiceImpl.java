package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.Medicamentos;
import com.zealepsoluciones.nutricionbackend.repository.MedicamentosRepository;
import com.zealepsoluciones.nutricionbackend.service.MedicamentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicamentosServiceImpl implements MedicamentosService {

    private final MedicamentosRepository medicamentosRepository;

    @Override
    public Medicamentos save(Medicamentos t) {
        t.setActivo(true);
        return medicamentosRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Medicamentos m = this.findById(id);
        if (m != null) {
            m.setActivo(false);
            medicamentosRepository.save(m);
        }
    }

    @Override
    public List<Medicamentos> findAll() {
        return medicamentosRepository.findByActivo(true);
    }

    @Override
    public Medicamentos findById(Long id) {
        return medicamentosRepository.findById(id).orElse(null);
    }
}
