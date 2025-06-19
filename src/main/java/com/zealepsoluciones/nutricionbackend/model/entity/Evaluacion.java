package com.zealepsoluciones.nutricionbackend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
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
    private BigDecimal peso;
    private BigDecimal talla;
    private BigDecimal imc;
    private BigDecimal circunfenciaCintura;
    private BigDecimal circunfenciaCadera;
    private BigDecimal relacionCinturaCadera;
    private BigDecimal medidaCuello;
    private BigDecimal masaMuscular;
    private BigDecimal tasaMetabolicaBasal;
    private BigDecimal porcentajeGrasaCorporal;
    private BigDecimal gastoEnergeticoTotal;
    private BigDecimal deficitCalorico;
    private BigDecimal porcentajeProteina;
    private BigDecimal porcentajeCarbohidratos;
    private BigDecimal porcentajeGrasas;
    private String observaciones;
    private Boolean activo;

}
