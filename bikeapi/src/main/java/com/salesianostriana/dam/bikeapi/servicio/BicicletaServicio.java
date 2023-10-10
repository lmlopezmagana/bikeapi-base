package com.salesianostriana.dam.bikeapi.servicio;


import com.salesianostriana.dam.bikeapi.repositorio.BicicletaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BicicletaServicio {

    private final BicicletaRepositorio repositorio;

}
