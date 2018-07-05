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
@Table(name="estadoCivil")
public class EstadoCivil {

	@Id
	@Column(name="idEstadoCivil",unique=true,nullable=false)
	private int idEstadoCivil;
	
	@Column(name="descripcion",nullable=false,length=200)
	private String descripcion;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="estadocivil")
	private Set<Personas> personas=new HashSet<Personas>();
	

	
	public EstadoCivil(int idEstadoCivil, String descripcion, Set<Personas> personas) {
		super();
		this.idEstadoCivil = idEstadoCivil;
		this.descripcion = descripcion;
		this.personas = personas;
	}

	public EstadoCivil(){
		
	}

	public int getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Personas> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Personas> personas) {
		this.personas = personas;
	}
	

}
