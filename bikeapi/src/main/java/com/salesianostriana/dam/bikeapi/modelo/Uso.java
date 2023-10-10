package com.salesianostriana.dam.bikeapi.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Uso {

    public static final double COSTE_POR_MINUTO = 0.02;

    @Id @GeneratedValue
    private Long id;

    private LocalDateTime fechaInicio = LocalDateTime.now();

    private LocalDateTime fechaFin;

    private double coste;

    @ManyToOne
    private Bicicleta bicicleta;

    @ManyToOne
    private Estacion estacionSalida;

    @ManyToOne
    private Estacion estacionLlegada;

    @ManyToOne
    private Usuario usuario;

    // Helpers

    public void addToUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.getUsos().add(this);
    }

    public void removeFromUsuario(Usuario usuario) {
        this.usuario = null;
        usuario.getUsos().remove(this);
    }


}
