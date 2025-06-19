package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.Patologias;
import com.zealepsoluciones.nutricionbackend.repository.PatologiasRepository;
import com.zealepsoluciones.nutricionbackend.service.PatologiasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatologiasServiceImpl implements PatologiasService {
    private final PatologiasRepository patologiasRepository;

    @Override
    public Patologias save(Patologias t) {
        t.setActivo(true);
        return patologiasRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Patologias p = this.findById(id);
        if (p != null) {
            p.setActivo(false);
            patologiasRepository.save(p);
        }
    }

    @Override
    public List<Patologias> findAll() {
        return patologiasRepository.findByActivo(true);
    }

    @Override
    public Patologias findById(Long id) {
        return patologiasRepository.findById(id).orElse(null);
    }
}
