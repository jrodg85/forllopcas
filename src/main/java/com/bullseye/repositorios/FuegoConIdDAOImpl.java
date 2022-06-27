package com.bullseye.repositorios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import com.bullseye.entidades.DepositoConId;
import com.bullseye.entidades.FuegoConId;

@Transactional(readOnly = true)
public class FuegoConIdDAOImpl implements FuegoConIdDAOCustom {

  FuegoConIdDAO fuegoConIdDAO;

  @Autowired
  public FuegoConIdDAOImpl(@Lazy FuegoConIdDAO fuegoConIdDAO) {
    this.fuegoConIdDAO = fuegoConIdDAO;
  }

  @PersistenceContext
  EntityManager entityManager;

  @Override
  public Set<DepositoConId> lManzanara(Double calibreEnMilimetros, String sistemaAccion) {
    List<FuegoConId> todasLasArmasDeFuego = fuegoConIdDAO.findAll();
    Set<DepositoConId> resultado = new HashSet<DepositoConId>();
    for (FuegoConId cadaFuego : todasLasArmasDeFuego) {
      if (cadaFuego.getCalibreEnMilimetros() == calibreEnMilimetros) {
        if (cadaFuego.getSistemaAccion() == sistemaAccion) {
          resultado.add(cadaFuego.getDeposito());
        }
      }
    }

    return resultado;
  }

}
