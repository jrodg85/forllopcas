package com.bullseye.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import com.bullseye.repositorios.FuegoConIdDAOListener;

import es.bullseye.FuegoInterfaz;



@Entity
@EntityListeners(FuegoConIdDAOListener.class)
@Access(value = AccessType.FIELD)
@DiscriminatorValue("FUEGO")
public class FuegoConId extends ArmaConId implements FuegoInterfaz {

	
	private double calibreEnMilimetros;
	
	@Column(name = "CARGADOR")
	private int cargador;
	
	

	@Column(name = "SISTEMA DE ACCION")
	private String sistemaAccion;

	@Override
	public double getCalibreEnMilimetros() {

		return calibreEnMilimetros;
	}

	@Override
	public void setCalibreEnMilimetros(double calibreEnMilimetros) {
		this.calibreEnMilimetros = calibreEnMilimetros;

	}
	

	public String getSistemaAccion() {
		return sistemaAccion;
	}

	public void setSistemaAccion(String sistemaAccion) {
		this.sistemaAccion = sistemaAccion;
	}

	public FuegoConId() {
	}

	public FuegoConId(String nombre, int peso) {
		super(nombre, peso);
				
	}

	@Override
	public int getCargador() {
		
		return cargador;
	}

	@Override
	public void setCargador(int cargador) {
		this.cargador = cargador;
		
	}

}
