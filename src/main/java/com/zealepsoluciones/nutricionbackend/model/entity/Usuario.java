package com.zealepsoluciones.nutricionbackend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Usuario extends Auditable implements UserDetails  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String celular;
    private String correo;
    private String username;
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
    private Boolean activo;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(()-> this.rol.getNombre());
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
