package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Menu;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends CrudRepository<Menu, Long> {
}
