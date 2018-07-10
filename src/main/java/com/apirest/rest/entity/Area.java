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
import javax.validation.constraints.NotBlank;

import com.apirest.rest.entity.Cliente;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Entity
@Table(name="area")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Area {

	@Id
	@GeneratedValue
	@Column(name = "idArea")
	private Integer idArea;

	@NotBlank(message="Insertar el nombre del Area")
	@Column(name = "nombreArea", nullable = false, length = 50)
	private String nombreArea;
	
	

	@JsonProperty("Cliente")
	@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idCliente")
	@JsonIgnoreProperties("nombreCliente")

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "area")
	private Set<GerentesArea> gerentesArea = new HashSet<GerentesArea>();
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "area")
	private Set<RegistroAsignacion> registroAsignacion = new HashSet<RegistroAsignacion>();

	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}

	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}

	
	@Override
	public String toString() {
		return "Area [idArea=" + idArea + ", nombreArea=" + nombreArea + ", cliente=" + cliente + ", gerentesArea="
				+ gerentesArea + ", registroAsignacion=" + registroAsignacion + "]";
	}

	public Area() {

	}

	
	public Area(Integer idArea, String nombreArea, Cliente cliente) {
		super();
		this.idArea = idArea;
		this.nombreArea = nombreArea;
		this.cliente = cliente;
	}

	public Area(Integer idArea, String nombreArea, Cliente cliente, Set<GerentesArea> gerentesArea) {
		super();
		this.idArea = idArea;
		this.nombreArea = nombreArea;
		this.cliente = cliente;
		this.gerentesArea = gerentesArea;
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

	public Cliente getCliente() {
		return cliente;
	}

	@JsonIgnoreProperties("nombreCliente")
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<GerentesArea> getGerentesArea() {
		return gerentesArea;
	}

	public void setGerentesArea(Set<GerentesArea> gerentesArea) {
		this.gerentesArea = gerentesArea;
	}

}
