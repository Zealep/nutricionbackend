package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.ComposicionAlimento;
import com.zealepsoluciones.nutricionbackend.repository.ComposicionAlimentoRepository;
import com.zealepsoluciones.nutricionbackend.service.ComposicionAlimentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComposicionAlimentoServiceImpl implements ComposicionAlimentoService {

    private final ComposicionAlimentoRepository composicionAlimentoRepository;

    @Override
    public ComposicionAlimento save(ComposicionAlimento t) {
        return composicionAlimentoRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
    ComposicionAlimento c = this.findById(id);
        if (c != null) {
            composicionAlimentoRepository.delete(c);
        }
    }

    @Override
    public List<ComposicionAlimento> findAll() {
        return (List<ComposicionAlimento>) composicionAlimentoRepository.findAll();
    }

    @Override
    public ComposicionAlimento findById(Long id) {
        return composicionAlimentoRepository.findById(id).orElse(null);
    }
}
