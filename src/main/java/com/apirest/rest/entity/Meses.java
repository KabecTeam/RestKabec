package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="meses")
public class Meses {
	
	@Id
	@Column(name="idMes",unique=true,nullable=false)
	private int idMes;
	
	@Column(name="nMes",nullable=false,length=15)
	private String nMes;

	public Meses(int idMes, String nMes) {
		super();
		this.idMes = idMes;
		this.nMes = nMes;
	}

	public int getIdMes() {
		return idMes;
	}

	public void setIdMes(int idMes) {
		this.idMes = idMes;
	}

	public String getnMes() {
		return nMes;
	}

	public void setnMes(String nMes) {
		this.nMes = nMes;
	}
}	
	