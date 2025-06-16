package com.zealepsoluciones.nutricionbackend.model.enums;

public enum ActividadFisica {

    SEDENTARIO("1"), //trabajo de escritorio, poco o nada de ejercicio
    LIGERAMENTE_ACTIVO("2"), //ejercicio ligero o deportes 1-3 días a la semana
    MODERADAMENTE_ACTIVO("3"), //ejercicio moderado o deportes 3-5 días a la semana
    MUY_ACTIVO("4"), //ejercicio intenso o deportes 6-7 días a la semana
    EXTREMEDAMENTE_ACTIVO("5"); //ejercicio intenso diario o trabajo físico duro

    private final String descripcion;

    ActividadFisica(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
