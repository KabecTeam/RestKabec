package com.apirest.rest.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
=======
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="cliente")

public class Cliente {

	@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
>>>>>>> 526985f72e556d499e62526f54f34e0456ec364c
	@Column(name="idCliente")
	private Integer idCliente;
	

	@Column(name="nombreCliente", nullable=false, length=50)
	private String nombreCliente;
	
<<<<<<< HEAD
=======
	@OneToMany(fetch=FetchType.EAGER,mappedBy="cliente")
	private Set<Area> area=new HashSet<Area>(); 
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="cliente")
	private Set<RegistroAsignacion> registroAsignacion=new HashSet<RegistroAsignacion>(); 
	

	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}


	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}


>>>>>>> 526985f72e556d499e62526f54f34e0456ec364c
	public Cliente(){
		
	}
	
	
<<<<<<< HEAD

	public Cliente(Integer idCliente, String nombreCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
	}



=======
	public Cliente(Integer idCliente, String nombreCliente, Set<Area> area) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.area = area;
	}
	
	
>>>>>>> 526985f72e556d499e62526f54f34e0456ec364c
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
<<<<<<< HEAD
	
	
}
	
=======
	public Set<Area> getArea() {
		return area;
	}

	public void setArea(Set<Area> area) {
		this.area = area;
	}




}
>>>>>>> 526985f72e556d499e62526f54f34e0456ec364c
