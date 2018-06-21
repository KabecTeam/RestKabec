package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.apirest.rest.entity.RegistroAsignacion;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.apirest.rest.entity.Areaa;


@Entity
@Table(name="cliente")

public class Cliente {

	@Id
	@GeneratedValue
	@Column(name="idCliente")
	private Integer idCliente;
	

	@Column(name="nombreCliente", nullable=false, length=50)
	private String nombreCliente;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy="cliente")
	private Set<Areaa> area=new HashSet<Areaa>(); 
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy="cliente")
	private Set<RegistroAsignacion> registroAsignacion=new HashSet<RegistroAsignacion>(); 
	
	@JsonIgnore
	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}


	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}


	public Cliente(){
		
	}
	
	
	public Cliente(Integer idCliente, String nombreCliente, Set<Areaa> area) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.area = area;
	}
	
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Set<Areaa> getArea() {
		return area;
	}

	public void setArea(Set<Areaa> area) {
		this.area = area;
	}




}
