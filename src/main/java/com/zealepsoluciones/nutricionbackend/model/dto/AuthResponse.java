package com.zealepsoluciones.nutricionbackend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private Long usuarioId;
    private String correo;
    private String username;
    private String rol;
}
