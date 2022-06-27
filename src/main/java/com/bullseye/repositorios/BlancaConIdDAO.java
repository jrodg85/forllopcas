package com.bullseye.repositorios;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bullseye.entidades.BlancaConId;

@RepositoryRestResource(path = "blancas", itemResourceRel = "blanca", collectionResourceRel = "blancas")
public interface BlancaConIdDAO extends JpaRepository<BlancaConId, Long>{

	@RestResource(path = "por-longitud") 	
	Collection<BlancaConId> findByLongitudEnMilimetros(@Param("longitudEnMilimetros") double longitudEnMilimetros);
}
