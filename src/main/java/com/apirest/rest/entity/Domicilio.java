package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="domicilio")
public class Domicilio {

	@Id
	@GeneratedValue
	@Column(name="idDomicilio",unique=true,nullable=false)
	private int idDomicilio;
	@Column(name="cp",nullable=false)
	private int cp;
	@Column(name="lote",length=30)
	private String lote;
	@Column(name="delegacion",nullable=false,length=100)
	private String delegacion;
	@Column(name="manzana",length=30)
	private String manzana;
	@Column(name="colonia",length=100)
	private String colonia;
	@Column(name="noInt",length=30)
	private String noInt;
	@Column(name="calle",length=150)
	private String calle;
	@Column(name="noExt",length=100)
	private String noExt;	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idpersona",nullable=false)
	private Persona personas;
	
	public Domicilio(){
		
	}

	public Domicilio(int idDomicilio, int cp, String lote, String delegacion, String manzana, String colonia,
			String noInt, String calle, String noExt, Persona personas) {
		super();
		this.idDomicilio = idDomicilio;
		this.cp = cp;
		this.lote = lote;
		this.delegacion = delegacion;
		this.manzana = manzana;
		this.colonia = colonia;
		this.noInt = noInt;
		this.calle = calle;
		this.noExt = noExt;
		this.personas = personas;
	}

	public int getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getNoInt() {
		return noInt;
	}

	public void setNoInt(String noInt) {
		this.noInt = noInt;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNoExt() {
		return noExt;
	}

	public void setNoExt(String noExt) {
		this.noExt = noExt;
	}

	public Persona getPersonas() {
		return personas;
	}

	public void setPersonas(Persona personas) {
		this.personas = personas;
	}
	
	
	
	
}
