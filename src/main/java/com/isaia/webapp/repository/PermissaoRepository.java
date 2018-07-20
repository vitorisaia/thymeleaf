package com.isaia.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaia.webapp.entity.GrupoEntity;
import com.isaia.webapp.entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {

	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);
}