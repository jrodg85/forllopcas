package com.bullseye.repositorios;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bullseye.entidades.ArmaConId;



@RepositoryRestResource(path = "armas", itemResourceRel = "arma", collectionResourceRel = "armas")
public interface ArmaConIdDAO extends JpaRepository<ArmaConId, Long> {
	
	@RestResource(path = "por-nombre")
	Collection<ArmaConId> findByNombre(@Param("nombre") String nombre);
	
	@RestResource(path = "por-peso")
	Collection<ArmaConId> findByPeso(@Param("peso") Integer peso);
	
	
}
