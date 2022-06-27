package com.bullseye.repositorios;

import java.util.Set;
import com.bullseye.entidades.DepositoConId;

public interface FuegoConIdDAOCustom {


  Set<DepositoConId> lManzanara(Double calibreEnMilimetros, String sistemaDeAccion);
}
