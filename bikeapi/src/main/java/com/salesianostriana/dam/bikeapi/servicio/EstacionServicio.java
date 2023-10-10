package com.salesianostriana.dam.bikeapi.servicio;

import com.salesianostriana.dam.bikeapi.repositorio.EstacionRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstacionServicio {

    private final EstacionRepositorio repositorio;
}
