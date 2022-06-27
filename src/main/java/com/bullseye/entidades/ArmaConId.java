package com.bullseye.entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import es.bullseye.Arma;


@Entity
@Table(name = "ARMAS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_ARMAS", discriminatorType = DiscriminatorType.STRING)
public abstract class ArmaConId extends Arma {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DEPOSITO", referencedColumnName = "idDeposito")
	private DepositoConId deposito;
	

	public DepositoConId getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoConId deposito) {
		this.deposito = deposito;
	}

	public ArmaConId() {

	}

	public ArmaConId(String nombre, int peso) {
		super(nombre, peso);

	}

}
