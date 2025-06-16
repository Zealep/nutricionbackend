package com.zealepsoluciones.nutricionbackend.controller;

import com.zealepsoluciones.nutricionbackend.config.JwtServiceImpl;
import com.zealepsoluciones.nutricionbackend.model.dto.AuthRequest;
import com.zealepsoluciones.nutricionbackend.model.dto.AuthResponse;
import com.zealepsoluciones.nutricionbackend.model.entity.Usuario;
import com.zealepsoluciones.nutricionbackend.service.impl.UserLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtServiceImpl jwtService;
    private final UserLoginService userDetailsService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getUsername(),
                            request.getPassword()
                    )
            );
        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid credentials");
        }
        var user = (Usuario) userDetailsService.loadUserByUsername(request.getUsername());
        String token = jwtService.generateToken(user);

        AuthResponse response = new AuthResponse(token, user.getId(),user.getCorreo(), user.getUsername(), user.getRol().getNombre());
        return ResponseEntity.ok(response);

    }
}
