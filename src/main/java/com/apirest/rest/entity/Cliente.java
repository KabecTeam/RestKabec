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
@Table(name="cliente")

public class Cliente {

	@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCliente")
	private Integer idCliente;
	

	@Column(name="nombreCliente", nullable=false, length=50)
	private String nombreCliente;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="cliente")
	private Set<Area> area=new HashSet<Area>(); 
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="cliente")
	private Set<RegistroAsignacion> registroAsignacion=new HashSet<RegistroAsignacion>(); 
	

	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}


	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}


	public Cliente(){
		
	}
	
	
	public Cliente(Integer idCliente, String nombreCliente, Set<Area> area) {
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
	public Set<Area> getArea() {
		return area;
	}

	public void setArea(Set<Area> area) {
		this.area = area;
	}




}
