package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public Cliente(){
		
	}
	
	

	public Cliente(Integer idCliente, String nombreCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
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
	
	
}
	