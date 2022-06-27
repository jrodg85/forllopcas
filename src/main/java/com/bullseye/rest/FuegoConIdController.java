
package com.bullseye.rest;

import java.util.Set;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bullseye.entidades.DepositoConId;
import com.bullseye.repositorios.FuegoConIdDAO;


@RepositoryRestController
public class FuegoConIdController {

  FuegoConIdDAO fuegoConIdDAO;

  public FuegoConIdController(FuegoConIdDAO fuegoConIdDAO) {
    this.fuegoConIdDAO = fuegoConIdDAO;
  }

  @GetMapping("/fuego/search/lmanzanara")
  @ResponseBody
  public ResponseEntity<Set<DepositoConId>> lManzanara(
      @RequestParam("calibreEnMilimetros") Double calibreEnMilimetros,
      @RequestParam("sistemaAccion") String sistemaAccion) {
    Set<DepositoConId> depositos = fuegoConIdDAO.lManzanara(calibreEnMilimetros, sistemaAccion);
    return new ResponseEntity<Set<DepositoConId>>(depositos, HttpStatus.OK);
  }
}
