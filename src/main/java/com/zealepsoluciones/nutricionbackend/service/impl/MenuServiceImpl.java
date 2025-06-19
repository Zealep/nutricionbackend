package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.model.entity.Menu;
import com.zealepsoluciones.nutricionbackend.repository.MenuRepository;
import com.zealepsoluciones.nutricionbackend.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Override
    public Menu save(Menu t) {
        return menuRepository.save(t);
    }

    @Override
    public void deleteById(Long id) {
        Menu m = this.findById(id);
        if (m != null) {
            menuRepository.delete(m);
        }
    }

    @Override
    public List<Menu> findAll() {
        return (List<Menu>)menuRepository.findAll();
    }

    @Override
    public Menu findById(Long id) {
        return menuRepository.findById(id).orElse(null);
    }
}
