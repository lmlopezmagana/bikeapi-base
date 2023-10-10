package com.salesianostriana.dam.bikeapi.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    private String numeroTarjeta;

    private int pin;

    private double saldo;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Uso> usos = new ArrayList<>();



}
