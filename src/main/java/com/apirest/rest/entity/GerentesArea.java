package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="gerentesArea")
public class GerentesArea {

	@Id
	@Column(name="idGerente")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idGerente;
	
	@Column(name="nombre", nullable=false ,length=30)
	private String  nombre;
	
	@Column(name="apellidoPaterno", nullable=false ,length=30)
	private String apellidoPaterno;
	
	@Column(name="apellidoMaterno", nullable=true ,length=30)
	private String apellidoMaterno;
	
	@Column(name="numTelefonico", nullable=true ,length=15)
	private String numTelefonico;
	
	@Column(name="extNumeroTelefonico", nullable=true ,length=10)	
	private String extNumeroTelefonico;
	
	@Column(name="correo", nullable=true ,length=50)	
	private String correo;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idArea" ,nullable=false)
	private Area area;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "gerentesArea")
	private Set<LideresConsultor> lideresConsultor= new HashSet<LideresConsultor>();
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "gerentesArea")
	private Set<RegistroAsignacion> registroAsignacion= new HashSet<RegistroAsignacion>();
	
	
	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}

	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}

	public GerentesArea(){
		
	}
	
	public GerentesArea(Integer idGerente, String nombre, String apellidoPaterno, String apellidoMaterno,
			String numTelefonico, String extNumeroTelefonico, String correo, Area area,
			Set<LideresConsultor> lideresConsultor) {
		super();
		this.idGerente = idGerente;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numTelefonico = numTelefonico;
		this.extNumeroTelefonico = extNumeroTelefonico;
		this.correo = correo;
		this.area = area;
		this.lideresConsultor = lideresConsultor;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Set<LideresConsultor> getLideresConsultor() {
		return lideresConsultor;
	}

	public void setLideresConsultor(Set<LideresConsultor> lideresConsultor) {
		this.lideresConsultor = lideresConsultor;
	}

	
}
