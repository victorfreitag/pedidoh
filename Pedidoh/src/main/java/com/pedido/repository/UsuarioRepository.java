package com.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedido.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
