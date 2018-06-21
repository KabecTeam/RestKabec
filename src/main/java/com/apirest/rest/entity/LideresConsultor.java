package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lideresConsultor")
public class LideresConsultor {

	@Id
	@GeneratedValue
	@Column(name = "idLider")
	private Integer idLider;

	@Column(name = "nombre", nullable = false, length = 30)
	private String nombre;

	@Column(name = "apellidoPaterno", nullable = false, length = 30)
	private String apellidoPaterno;

	@Column(name = "apellidoMaterno", nullable = true, length = 30)
	private String apellidoMaterno;

	@Column(name = "numTelefonico", nullable = true, length = 15)
	private String numTelefonico;

	@Column(name = "extNumeroTelefonico", nullable = true, length = 10)
	private String extNumeroTelefonico;

	@Column(name = "correo", nullable = true, length = 50)
	private String correo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idGerente", nullable = false)
	private GerentesArea gerentesArea;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "lider")
	private Set<RegistroAsignacion> lideresConsultor= new HashSet<RegistroAsignacion>();

	public Set<RegistroAsignacion> getLideresConsultor() {
		return lideresConsultor;
	}

	public void setLideresConsultor(Set<RegistroAsignacion> lideresConsultor) {
		this.lideresConsultor = lideresConsultor;
	}

	public LideresConsultor() {

	}

	public LideresConsultor(Integer idLider, String nombre, String apellidoPaterno, String apellidoMaterno,
			String numTelefonico, String extNumeroTelefonico, String correo, GerentesArea gerentesArea) {
		super();
		this.idLider = idLider;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numTelefonico = numTelefonico;
		this.extNumeroTelefonico = extNumeroTelefonico;
		this.correo = correo;
		this.gerentesArea = gerentesArea;
	}

	public Integer getIdLider() {
		return idLider;
	}

	public void setIdLider(Integer idLider) {
		this.idLider = idLider;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNumTelefonico() {
		return numTelefonico;
	}

	public void setNumTelefonico(String numTelefonico) {
		this.numTelefonico = numTelefonico;
	}

	public String getExtNumeroTelefonico() {
		return extNumeroTelefonico;
	}

	public void setExtNumeroTelefonico(String extNumeroTelefonico) {
		this.extNumeroTelefonico = extNumeroTelefonico;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public GerentesArea getGerentesArea() {
		return gerentesArea;
	}

	public void setGerentesArea(GerentesArea gerentesArea) {
		this.gerentesArea = gerentesArea;
	}

}
