package com.zealepsoluciones.nutricionbackend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Paciente extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String sexo;
    private LocalDate fechaNacimiento;
    private String estadoCivil;
    private String numeroDocumento;
    private String ocupacion;
    String direccion;
    private String celular;
    private String correo;
    private String actividadFisica;
    private BigDecimal peso;
    private BigDecimal talla;

    //relacion muchos a muchos con la tabla patologias
    @ManyToMany
    @JoinTable(
        name = "paciente_patologia",
        joinColumns = @JoinColumn(name = "paciente_id"),
        inverseJoinColumns = @JoinColumn(name = "patologia_id")
    )
    private List<Patologias> patologias;
    //relacion muchos a muchos con la tabla patologias para familiar
    @ManyToMany
    @JoinTable(
            name = "paciente_patologia_familiar",
            joinColumns = @JoinColumn(name = "paciente_id"),
            inverseJoinColumns = @JoinColumn(name = "patologia_id")
    )
    private List<Patologias> antecedentesPatologicosFamiliares;
    @ManyToMany
    @JoinTable(
            name = "paciente_patologia_antecedente",
            joinColumns = @JoinColumn(name = "paciente_id"),
            inverseJoinColumns = @JoinColumn(name = "patologia_id")
    )
    private List<Patologias> antecedentesPatologicos;
    //relacion muchos a muchos con la tabla alergias
    @ManyToMany
    @JoinTable(
        name = "paciente_alergia",
        joinColumns = @JoinColumn(name = "paciente_id"),
        inverseJoinColumns = @JoinColumn(name = "alergia_id")
    )
    private List<Alergias> alergias;

    //relacion muchos a muchos con la tabla medicamentos
    @ManyToMany
    @JoinTable(
        name = "paciente_medicamento",
        joinColumns = @JoinColumn(name = "paciente_id"),
        inverseJoinColumns = @JoinColumn(name = "medicamento_id")
    )
    private List<Medicamentos> medicamentos;

    private String observaciones;
    private Boolean activo;


}
