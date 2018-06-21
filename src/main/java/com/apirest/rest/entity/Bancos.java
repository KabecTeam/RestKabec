package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bancos")
public class Bancos {

	@Id
	@Column(name="idBanco",unique=true,nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBanco;
	@Column(name="nombreBanco",nullable=false,length=80)
	private String nombreBanco;
	
	public Bancos(){
		
	}

	public Bancos(int idBanco, String nombreBanco) {
		super();
		this.idBanco = idBanco;
		this.nombreBanco = nombreBanco;
	}



	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

}

