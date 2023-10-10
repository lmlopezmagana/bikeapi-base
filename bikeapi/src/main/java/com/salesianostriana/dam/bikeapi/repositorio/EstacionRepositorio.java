package com.salesianostriana.dam.bikeapi.repositorio;

import com.salesianostriana.dam.bikeapi.modelo.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionRepositorio extends JpaRepository<Estacion, Long> {
}
