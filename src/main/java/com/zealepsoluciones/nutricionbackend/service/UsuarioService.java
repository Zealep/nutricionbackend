package com.zealepsoluciones.nutricionbackend.service;

import com.zealepsoluciones.nutricionbackend.model.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario findById(Long id);
    Usuario findByUsername(String username);
    Usuario save(Usuario u);
    void deleteById(Long id);
    List<Usuario> findAll();

}
