package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="genero")

public class Genero {

	@Id
	@Column(name="idGenero",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
private int idGenero;	
	@Column(name="tipoGenero",nullable=false, length=12)
	private String tipoGenero;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="genero")
	private Set<Personas> personas=new HashSet<Personas>();

	public Genero(int idGenero, String tipoGenero, Set<Personas> personas) {
		super();
		this.idGenero = idGenero;
		this.tipoGenero = tipoGenero;
		this.personas = personas;
	}

	public Genero(){
		
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public Set<Personas> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Personas> personas) {
		this.personas = personas;
	}

	

}
