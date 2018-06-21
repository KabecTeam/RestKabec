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
@Table(name="gerenteComercial")
public class GerenteComercial {

	@Id
	@GeneratedValue
	@Column(name="idGerenteComercial")
	private Integer idGerenteComercial;
	
	@Column(name="nombre", nullable=false ,length=30)
	private String  nombre;
	
	@Column(name="apellidoPaterno", nullable=false ,length=30)
	private String apellidoPaterno;
	
	@Column(name="apellidoMaterno", nullable=true ,length=30)
	private String apellidoMaterno;
	
	@Column(name="numTelefonico", nullable=true ,length=15)
	private String numTelefonico;
	
	@Column(name="correo", nullable=true ,length=50)	
	private String correo;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "gerenteComercial")
	private Set<RegistroAsignacion> registroAsignacion= new HashSet<RegistroAsignacion>();
	

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "gerenteComercial")
	//private Set<RegistroAsignacion> registroAsignacion= new HashSet<RegistroAsignacion>();
	
	
	
	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}
	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}
	public GerenteComercial(){
		
	}
	public GerenteComercial(String nombre, String apellidoPaterno, String apellidoMaterno,
			String numTelefonico, String correo) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numTelefonico = numTelefonico;
		this.correo = correo;
	}
	
	/*public GerenteComercial(Integer idGerenteComercial, String nombre, String apellidoPaterno, String apellidoMaterno,
			String numTelefonico, String correo) {
		super();
		this.idGerenteComercial = idGerenteComercial;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numTelefonico = numTelefonico;
		this.correo = correo;
	}*/
	
	public GerenteComercial(Integer idGerenteComercial, String nombre, String apellidoPaterno, String apellidoMaterno,
			String numTelefonico, String correo) {
		super();
		this.idGerenteComercial = idGerenteComercial;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.numTelefonico = numTelefonico;
		this.correo = correo;
	}
	
	
	public Integer getIdGerenteComercial() {
		return idGerenteComercial;
	}

	public void setIdGerenteComercial(Integer idGerenteComercial) {
		this.idGerenteComercial = idGerenteComercial;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
	/*public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}
	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}*/

}
