package com.salesianostriana.dam.bikeapi.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bicicleta {

    @Id @GeneratedValue
    private Long id;

    private String marca, modelo;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    private Estacion estacion;

    // Métodos helper

    public void addToEstacion(Estacion estacion) {
        estacion.getBicicletas().add(this);
        this.estacion = estacion;
    }

    public void removeFromEstacion(Estacion estacion) {
        estacion.getBicicletas().remove(this);
        this.estacion = null;
    }

}
