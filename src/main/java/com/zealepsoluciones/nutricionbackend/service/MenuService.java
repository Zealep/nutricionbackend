package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Menu;

import java.util.List;

public interface MenuService {
    Menu save(Menu t);
    void deleteById(Long id);
    List<Menu> findAll();
    Menu findById(Long id);
}
