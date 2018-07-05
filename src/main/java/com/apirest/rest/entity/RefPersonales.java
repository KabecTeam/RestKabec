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
@Table(name = "refPersonales")
public class RefPersonales {

	@Id
	@GeneratedValue
	@Column(name = "idRefPerson", unique = true, nullable = false)
	private int idRefPerson;

	@Column(name = "nombCompleto", length = 100)
	private String nombCompleto;

	@Column(name = "tiempoConocer", length = 50)
	private String tiempoConocer;

	@Column(name = "telefono", length = 60)
	private String telefono;

	@Column(name = "nombCompleto1", length = 100)
	private String nombCompleto1;

	@Column(name = "tiempoConocer1", length = 50)
	private String tiempoConocer1;

	@Column(name = "telefono1", length = 60)
	private String telefono1;

	@Column(name = "nombCompleto2", length = 100)
	private String nombCompleto2;

	@Column(name = "tiempoConocer2", length = 50)
	private String tiempoConocer2;

	@Column(name = "telefono2", length = 60)
	private String telefono2;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idpersona", nullable = false)
	private Personas personas;

	public RefPersonales() {

	}

	public RefPersonales(int idRefPerson, String nombCompleto, String tiempoConocer, String telefono,
			String nombCompleto1, String tiempoConocer1, String telefono1, String nombCompleto2, String tiempoConocer2,
			String telefono2, Personas personas) {
		super();
		this.idRefPerson = idRefPerson;
		this.nombCompleto = nombCompleto;
		this.tiempoConocer = tiempoConocer;
		this.telefono = telefono;
		this.nombCompleto1 = nombCompleto1;
		this.tiempoConocer1 = tiempoConocer1;
		this.telefono1 = telefono1;
		this.nombCompleto2 = nombCompleto2;
		this.tiempoConocer2 = tiempoConocer2;
		this.telefono2 = telefono2;
		this.personas = personas;
	}

	public String getNombCompleto1() {
		return nombCompleto1;
	}

	public void setNombCompleto1(String nombCompleto1) {
		this.nombCompleto1 = nombCompleto1;
	}

	public String getTiempoConocer1() {
		return tiempoConocer1;
	}

	public void setTiempoConocer1(String tiempoConocer1) {
		this.tiempoConocer1 = tiempoConocer1;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getNombCompleto2() {
		return nombCompleto2;
	}

	public void setNombCompleto2(String nombCompleto2) {
		this.nombCompleto2 = nombCompleto2;
	}

	public String getTiempoConocer2() {
		return tiempoConocer2;
	}

	public void setTiempoConocer2(String tiempoConocer2) {
		this.tiempoConocer2 = tiempoConocer2;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public int getIdRefPerson() {
		return idRefPerson;
	}

	public void setIdRefPerson(int idRefPerson) {
		this.idRefPerson = idRefPerson;
	}

	public String getNombCompleto() {
		return nombCompleto;
	}

	public void setNombCompleto(String nombCompleto) {
		this.nombCompleto = nombCompleto;
	}

	public String getTiempoConocer() {
		return tiempoConocer;
	}

	public void setTiempoConocer(String tiempoConocer) {
		this.tiempoConocer = tiempoConocer;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

}
