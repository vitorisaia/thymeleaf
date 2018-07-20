package com.isaia.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaia.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);

}