package com.bullseye.repositorios;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bullseye.entidades.DepositoConId;

@RepositoryRestResource(path = "depositos", itemResourceRel = "deposito", collectionResourceRel = "depositos")
public interface DepositoConIdDAO extends JpaRepository<DepositoConId, Long>{
  
  
  @RestResource(path = "por-codigo")
  Set<DepositoConId> findByCodigoDeposito(@Param("codigoDeposito") Integer codigoDeposito);
  
  @RestResource(exported=false)
  void delete(DepositoConId depositoConId);


}