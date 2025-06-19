package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Alergias;
import com.zealepsoluciones.nutricionbackend.model.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlergiasRepository extends CrudRepository<Alergias,Long> {
    List<Alergias> findByActivo(Boolean activo);

}
