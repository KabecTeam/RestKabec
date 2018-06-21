package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="escolaridad")
public class Escolaridad {

	
	@Id
	@GeneratedValue
	@Column(name="idEscolaridad",unique=true,nullable=false)
	private int idEscolaridad;
	
	@Column(name="ultGraEstud")
	private String ultGraEstud;
	
	@Column(name="escuelaProc")
	private String escuelaProc;
	
	@Column(name="docObtenido")
	private String docObtenido;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idpersona",nullable=false)
	private Personas personas;
	
	
	public Escolaridad(){
		
	}


	public Escolaridad(int idEscolaridad, String ultGraEstud, String escuelaProc, String docObtenido,
			Personas personas) {
		super();
		this.idEscolaridad = idEscolaridad;
		this.ultGraEstud = ultGraEstud;
		this.escuelaProc = escuelaProc;
		this.docObtenido = docObtenido;
		this.personas = personas;
	}


	public Escolaridad(int idEscolaridad, String ultGraEstud, String escuelaProc, String docObtenido) {
		super();
		this.idEscolaridad = idEscolaridad;
		this.ultGraEstud = ultGraEstud;
		this.escuelaProc = escuelaProc;
		this.docObtenido = docObtenido;
	}


	public int getIdEscolaridad() {
		return idEscolaridad;
	}


	public void setIdEscolaridad(int idEscolaridad) {
		this.idEscolaridad = idEscolaridad;
	}


	public String getUltGraEstud() {
		return ultGraEstud;
	}


	public void setUltGraEstud(String ultGraEstud) {
		this.ultGraEstud = ultGraEstud;
	}


	public String getEscuelaProc() {
		return escuelaProc;
	}


	public void setEscuelaProc(String escuelaProc) {
		this.escuelaProc = escuelaProc;
	}


	public String getDocObtenido() {
		return docObtenido;
	}


	public void setDocObtenido(String docObtenido) {
		this.docObtenido = docObtenido;
	}


	public Personas getPersonas() {
		return personas;
	}


	public void setPersonas(Personas personas) {
		this.personas = personas;
	}
	
}
