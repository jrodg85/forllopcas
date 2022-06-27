package com.bullseye.repositorios;


import javax.persistence.PrePersist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.bullseye.entidades.FuegoConId;





public class FuegoConIdDAOListener {
	
	
	
	private Logger log = LoggerFactory.getLogger(FuegoConIdDAOListener.class);
//	private FuegoConIdDAO fuegoConIdDAO;
//	
//	@Autowired
//	public void init(FuegoConIdDAO fuegoConIdDAO) {
//		this.fuegoConIdDAO = fuegoConIdDAO;
//	}
	
//	
	
	
	@PrePersist
	public void preGuardarFuego(FuegoConId fuego) throws Exception {
		if ( 20 < fuego.getCalibreEnMilimetros() && fuego.getCalibreEnMilimetros() < 0 ) {
			log.warn("Se ha intentado crear un arma que no esta dentro d elos parametros de calibre");
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El calibre debe ser superios a 0 e inferior a 20mm");
		}
	}	
}


