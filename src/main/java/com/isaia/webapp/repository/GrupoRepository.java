package com.isaia.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaia.webapp.entity.GrupoEntity;
import com.isaia.webapp.entity.UsuarioEntity;

@Repository
public interface GrupoRepository extends JpaRepository<GrupoEntity, Long> {

	List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);

}