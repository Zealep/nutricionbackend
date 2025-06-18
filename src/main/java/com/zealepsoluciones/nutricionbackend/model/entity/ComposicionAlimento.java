package com.zealepsoluciones.nutricionbackend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class ComposicionAlimento extends Auditable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;

    private String nombre;

    private String grupo;

    @Column(name = "energia_kcal")
    private Integer energiaKcal;

    @Column(name = "energia_kj")
    private Integer energiaKj;

    @Column(name = "agua_g", precision = 5, scale = 2)
    private BigDecimal aguaG;

    @Column(name = "prote_total_g", precision = 5, scale = 2)
    private BigDecimal proteTotalG;

    @Column(name = "prote_veg_g", precision = 5, scale = 2)
    private BigDecimal proteVegG;

    @Column(name = "prote_anim_g", precision = 5, scale = 2)
    private BigDecimal proteAnimG;

    @Column(name = "grasa_total_g", precision = 5, scale = 2)
    private BigDecimal grasaTotalG;

    @Column(name = "carbo_total_g", precision = 5, scale = 2)
    private BigDecimal carboTotalG;

    @Column(name = "carbo_dispo_g", precision = 5, scale = 2)
    private BigDecimal carboDispoG;

    @Column(name = "fibra_dietaria_g", precision = 5, scale = 2)
    private BigDecimal fibraDietariaG;

    @Column(name = "cenizas_g", precision = 5, scale = 2)
    private BigDecimal cenizasG;

    @Column(name = "calcio_mg", precision = 6, scale = 2)
    private BigDecimal calcioMg;

    @Column(name = "fosforo_mg", precision = 6, scale = 2)
    private BigDecimal fosforoMg;

    @Column(name = "zinc_mg", precision = 5, scale = 2)
    private BigDecimal zincMg;

    @Column(name = "hierro_mg", precision = 5, scale = 2)
    private BigDecimal hierroMg;

    @Column(name = "caroteno_tot_ug", precision = 7, scale = 2)
    private BigDecimal carotenoTotUg;

    @Column(name = "vitamina_a_tot_ug", precision = 7, scale = 2)
    private BigDecimal vitaminaATotUg;

    @Column(name = "tiamina_mg",precision = 7, scale = 2)
    private BigDecimal tiaminaMg;

    @Column(name = "riboflavina_mg", precision = 5, scale = 2)
    private BigDecimal riboflavinaMg;

    @Column(name = "niacina_mg", precision = 5, scale = 2)
    private BigDecimal niacinaMg;

    @Column(name = "vitamina_c_mg", precision = 5, scale = 2)
    private BigDecimal vitaminaCMg;

    @Column(name = "acido_folico_ug", precision = 6, scale = 2)
    private BigDecimal acidoFolicoUg;

    @Column(name = "sodio_mg", precision = 6, scale = 2)
    private BigDecimal sodioMg;

    @Column(name = "potasio_mg", precision = 6, scale = 2)
    private BigDecimal potasioMg;
}
