package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contratoNomina")
public class ContratoNomina {

	@Id
	@Column(name="contratoNomina",unique=true,nullable=false)
	private int contratoNomina;
	@Column(name="tipoConNom",nullable=false,length=35)
	private String tipoConNom;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="contratoNomina")
	private Set<RegistroContrato> registroContrato=new HashSet<RegistroContrato>();
	
	public ContratoNomina(int contratoNomina, String tipoConNom, Set<RegistroContrato> registroContrato) {
		super();
		this.contratoNomina = contratoNomina;
		this.tipoConNom = tipoConNom;
		this.registroContrato = registroContrato;
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

	public Set<RegistroContrato> getRegistroContrato() {
		return registroContrato;
	}

	public void setRegistroContrato(Set<RegistroContrato> registroContrato) {
		this.registroContrato = registroContrato;
	}
	
}
