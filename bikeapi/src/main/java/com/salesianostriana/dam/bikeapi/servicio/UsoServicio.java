package com.salesianostriana.dam.bikeapi.servicio;

import com.salesianostriana.dam.bikeapi.repositorio.UsoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UsoServicio {

    private final UsoRepositorio uso;

}
