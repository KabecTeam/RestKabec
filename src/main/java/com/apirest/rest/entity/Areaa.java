package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Areaa {
	
	@Id
	@GeneratedValue
	@Column(name = "idArea")
	private Integer idArea;

	@Column(name = "nombreArea", nullable = false, length = 50)
	private String nombreArea;

	
	@Column(name= "idCliente", nullable = false)
	private Integer idCliente;
	
	public Areaa(){}
	
	
	
	public Areaa(Integer idArea, String nombreArea, Integer idCliente) {
		super();
		this.idArea = idArea;
		this.nombreArea = nombreArea;
		this.idCliente = idCliente;
	}



	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}
	

}
