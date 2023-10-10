package com.salesianostriana.dam.bikeapi.repositorio;

import com.salesianostriana.dam.bikeapi.modelo.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicicletaRepositorio extends JpaRepository<Bicicleta, Long> {
}
