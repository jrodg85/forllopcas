package com.bullseye.entidades;

import javax.persistence.Entity;

import es.bullseye.BlancaInterfaz;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorValue;


@Entity
@Access(value = AccessType.FIELD)
@DiscriminatorValue("BLANCA")
public class BlancaConId extends ArmaConId implements BlancaInterfaz {

	private double longitudEnMilimetros;
	private String filo;
	private String forma;

	public BlancaConId() {
	}

	public BlancaConId(String nombre, int peso) {
		super(nombre, peso);

	}

	@Override
	public double getLongitudEnMilimetros() {

		return longitudEnMilimetros;
	}

	@Override
	public void setLongitudEnMilimetros(double longitudEnMilimetros) {
		this.longitudEnMilimetros = longitudEnMilimetros;

	}

	@Override
	public String getFilo() {
		
		return filo;
	}

	@Override
	public void setFilo(String filo) {
		this.filo=filo;
		
	}

	@Override
	public String getForma() {
		
		return forma;
	}

	@Override
	public void setForma(String forma) {
		this.forma=forma;
		
	}

}
