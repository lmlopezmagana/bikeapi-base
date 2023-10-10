package com.salesianostriana.dam.bikeapi.repositorio;

import com.salesianostriana.dam.bikeapi.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
