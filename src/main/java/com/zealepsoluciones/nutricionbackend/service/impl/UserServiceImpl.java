package com.zealepsoluciones.nutricionbackend.service.impl;

import com.zealepsoluciones.nutricionbackend.exception.BusinessException;
import com.zealepsoluciones.nutricionbackend.model.entity.Usuario;
import com.zealepsoluciones.nutricionbackend.repository.UsuarioRepository;
import com.zealepsoluciones.nutricionbackend.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsernameAndActivo(username,true).orElse(null);
    }

    @Override
    public Usuario save(Usuario u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        u.setActivo(true);
        return usuarioRepository.save(u);
    }

    @Override
    public void deleteById(Long id) {
        Usuario u = findById(id);
        if (u != null) {
            u.setActivo(false);
            usuarioRepository.save(u);
        }else{
            throw new BusinessException("El usuario no existe " + id);
        }
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAllByActivo(true);
    }
}
