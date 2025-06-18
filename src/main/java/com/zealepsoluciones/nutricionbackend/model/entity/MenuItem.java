package com.zealepsoluciones.nutricionbackend.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class MenuItem extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    @JsonIgnore
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "tiempo_comida_id", nullable = false)
    private TiempoComida tiempoComida;

    @ManyToOne
    @JoinColumn(name = "composicion_alimento_id", nullable = false)
    private ComposicionAlimento composicionAlimento;

    private BigDecimal cantidadGramos;

}
