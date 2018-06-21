package com.apirest.rest.entity;

<<<<<<< HEAD:src/main/java/com/apirest/rest/entity/ReportedeAsignados.java
public class ReportedeAsignados {
=======
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
@Table(name="area")
public class Area {
>>>>>>> 526985f72e556d499e62526f54f34e0456ec364c:src/main/java/com/apirest/rest/entity/Area.java

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idArea")
	private Integer idArea;

	@Column(name = "nombreArea", nullable = false, length = 50)
	private String nombreArea;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "area")
	private Set<GerentesArea> gerentesArea = new HashSet<GerentesArea>();
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "area")
	private Set<RegistroAsignacion> registroAsignacion = new HashSet<RegistroAsignacion>();

	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}

	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
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
