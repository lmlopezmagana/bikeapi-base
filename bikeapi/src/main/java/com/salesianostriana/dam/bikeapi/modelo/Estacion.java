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
public class Estacion {

    @Id @GeneratedValue
    private Long id;

    private int numero;

    private String nombre;

    private String coordenadas;

    private int capacidad;

    @OneToMany(mappedBy = "estacion", fetch = FetchType.EAGER)
    private List<Bicicleta> bicicletas = new ArrayList<>();






}
