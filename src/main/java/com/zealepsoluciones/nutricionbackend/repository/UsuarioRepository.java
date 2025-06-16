package com.zealepsoluciones.nutricionbackend.repository;

import com.zealepsoluciones.nutricionbackend.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Optional<Usuario> findByUsernameAndActivo(String username, Boolean activo);
    List<Usuario> findAllByActivo(Boolean activo);
}
