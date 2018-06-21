package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contratoNomina")
public class ContratoNomina {

	@Id
	@Column(name="contratoNomina",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contratoNomina;
	@Column(name="tipoConNom",nullable=false,length=35)
	private String tipoConNom;

	public ContratoNomina(int contratoNomina, String tipoConNom) {
		super();
		this.contratoNomina = contratoNomina;
		this.tipoConNom = tipoConNom;
	}
	
	public ContratoNomina(){
		
	}

	public int getContratoNomina() {
		return contratoNomina;
	}

	public void setContratoNomina(int contratoNomina) {
		this.contratoNomina = contratoNomina;
	}

	public String getTipoConNom() {
		return tipoConNom;
	}

	public void setTipoConNom(String tipoConNom) {
		this.tipoConNom = tipoConNom;
	}

	
}
