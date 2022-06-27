package com.bullseye.repositorios;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import com.bullseye.entidades.FuegoConId;

@RepositoryRestResource(path = "fuego", itemResourceRel = "fuego", collectionResourceRel = "fuegos")
public interface FuegoConIdDAO extends JpaRepository<FuegoConId, Long>, FuegoConIdDAOCustom {

  @RestResource(path = "por-calibre")
  Collection<FuegoConId> findByCalibreEnMilimetros(
      @Param("calibreEnMilimetros") Double calibreEnMilimetros);

  @RestResource(path = "por-sistema_accion")
  Collection<FuegoConId> findBySistemaAccion(@Param("sistemaAccion") String sistemaAccion);

  @RestResource(path = "por-calibreYsistemaAccion")
  Collection<FuegoConId> findByCalibreEnMilimetrosAndSistemaAccion(
      @Param("calibreEnMilimetros") Double calibreEnMilimetros,
      @Param("sistemaAccion") String sistemaAccion);

}
