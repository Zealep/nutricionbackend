package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.ComposicionAlimento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComposicionAlimentoRepository extends CrudRepository<ComposicionAlimento, Long> {
}
