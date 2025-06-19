package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.Alergias;
import com.zealepsoluciones.nutricionbackend.repository.AlergiasRepository;
import com.zealepsoluciones.nutricionbackend.service.AlergiasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlergiasServiceImpl implements AlergiasService {

    private final AlergiasRepository alergiasRepository;
    @Override
    public Alergias save(Alergias t) {
        t.setActivo(true);
        return alergiasRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Alergias a = this.findById(id);
        if (a != null) {
            a.setActivo(false);
            alergiasRepository.save(a);
        }
    }

    @Override
    public List<Alergias> findAll() {
        return alergiasRepository.findByActivo(true);
    }

    @Override
    public Alergias findById(Long id) {
        return alergiasRepository.findById(id).orElse(null);
    }
}
