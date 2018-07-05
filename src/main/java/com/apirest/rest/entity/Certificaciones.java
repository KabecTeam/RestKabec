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
@Table(name="certificaciones")
public class Certificaciones {

  @Id
  @Column(name="idCertificacion",unique=true,nullable=false)
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int idCertificacion;
  @Column(name="nombreCertificacion",length=80)
  private String nombreCertificacion;
  @Column(name="anioCertificacion")
  private int anioCertificacion;
  @Column(name="anioValidez")
  private int anioValidez;
  @Column(name="nombreCertificacion2",length=80)
  private String nombreCertificacion2;
  @Column(name="anioCertificacion2")
  private int anioCertificacion2;
  @Column(name="anioValidez2")
  private int anioValidez2;
  
  
  
  @ManyToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="personas",nullable=false)
  private Personas personas;
  
  public Certificaciones(){
	  
  }

public Certificaciones(int idCertificacion, String nombreCertificacion, int anioCertificacion, int anioValidez,
		String nombreCertificacion2, int anioCertificacion2, int anioValidez2, Personas personas) {
	super();
	this.idCertificacion = idCertificacion;
	this.nombreCertificacion = nombreCertificacion;
	this.anioCertificacion = anioCertificacion;
	this.anioValidez = anioValidez;
	this.nombreCertificacion2 = nombreCertificacion2;
	this.anioCertificacion2 = anioCertificacion2;
	this.anioValidez2 = anioValidez2;
	this.personas = personas;
}



public int getIdCertificacion() {
	return idCertificacion;
}

public void setIdCertificacion(int idCertificacion) {
	this.idCertificacion = idCertificacion;
}

public String getNombreCertificacion() {
	return nombreCertificacion;
}

public void setNombreCertificacion(String nombreCertificacion) {
	this.nombreCertificacion = nombreCertificacion;
}

public int getAnioCertificacion() {
	return anioCertificacion;
}

public void setAnioCertificacion(int anioCertificacion) {
	this.anioCertificacion = anioCertificacion;
}

public int getAnioValidez() {
	return anioValidez;
}

public void setAnioValidez(int anioValidez) {
	this.anioValidez = anioValidez;
}

public Personas getPersonas() {
	return personas;
}

public void setPersonas(Personas personas) {
	this.personas = personas;
}

public String getNombreCertificacion2() {
	return nombreCertificacion2;
}

public void setNombreCertificacion2(String nombreCertificacion2) {
	this.nombreCertificacion2 = nombreCertificacion2;
}

public int getAnioCertificacion2() {
	return anioCertificacion2;
}

public void setAnioCertificacion2(int anioCertificacion2) {
	this.anioCertificacion2 = anioCertificacion2;
}

public int getAnioValidez2() {
	return anioValidez2;
}

public void setAnioValidez2(int anioValidez2) {
	this.anioValidez2 = anioValidez2;
}

}
