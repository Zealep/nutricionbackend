package com.zealepsoluciones.nutricionbackend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Evaluacion extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "objetivo_id", nullable = false)
    private Objetivo objetivo;

    private LocalDate fecha;
    private Double peso;
    private Double talla;
    private Double imc;
    private Double tasaMetabolicaBasal;
    private Double porcentajeGrasaCorporal;
    private Double gastoEnergeticoTotal;
    private Double deficitCalorico;
    private Double porcentajeProteina;
    private Double porcentajeCarbohidratos;
    private Double porcentajeGrasas;
    private String observaciones;

}
