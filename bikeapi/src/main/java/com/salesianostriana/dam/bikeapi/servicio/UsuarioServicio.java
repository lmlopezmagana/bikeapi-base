package com.salesianostriana.dam.bikeapi.servicio;

import com.salesianostriana.dam.bikeapi.repositorio.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServicio {

    private final UsuarioRepositorio repositorio;


}
