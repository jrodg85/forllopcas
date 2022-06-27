package com.bullseye.entidades;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import es.bullseye.Deposito;



@Entity
@Table(name = "DEPOSITO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class DepositoConId extends Deposito {
	private int codigoDeposito;
	private Collection<ArmaConId> armasEnDeposito = new ArrayList<>();
	
	public void setArmas(Collection<ArmaConId> armasEnDeposito) {
		this.armasEnDeposito = armasEnDeposito;
	}

	@OneToMany(cascade = CascadeType.ALL, targetEntity = ArmaConId.class, mappedBy = "deposito")
	public Collection<ArmaConId> getArmasEnDeposito() {
		return armasEnDeposito;
	}
	
	public int getCodigoDeposito() {
		return codigoDeposito;
	}
	public void setCodigoDeposito(int codigoDeposito) {
		this.codigoDeposito = codigoDeposito;
	}

	public void addArmaConId(ArmaConId armasEnDeposito) {
		getArmasEnDeposito().add(armasEnDeposito);
		armasEnDeposito.setDeposito(this);
	}

	public DepositoConId() {

	}

	public DepositoConId(int codigoDeposito) {
		super(codigoDeposito);
	}
}
