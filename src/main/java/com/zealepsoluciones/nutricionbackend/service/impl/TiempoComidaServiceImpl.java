package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.TiempoComida;
import com.zealepsoluciones.nutricionbackend.repository.TiempoComidaRepository;
import com.zealepsoluciones.nutricionbackend.service.TiempoComidaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiempoComidaServiceImpl implements TiempoComidaService {
    private final TiempoComidaRepository tiempoComidaRepository;

    @Override
    public TiempoComida save(TiempoComida t) {
        t.setActivo(true);
        return tiempoComidaRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        TiempoComida t = this.findById(id);
        if (t != null) {
            t.setActivo(false);
            tiempoComidaRepository.save(t);
        }
    }

    @Override
    public List<TiempoComida> findAll() {
        return tiempoComidaRepository.findByActivo(true);
    }

    @Override
    public TiempoComida findById(Long id) {
        return tiempoComidaRepository.findById(id).orElse(null);
    }
}
