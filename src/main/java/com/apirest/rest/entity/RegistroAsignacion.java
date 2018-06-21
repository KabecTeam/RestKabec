package com.apirest.rest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="registroAsignacion")
public class RegistroAsignacion {

	

	@Id
	@GeneratedValue
	@Column(name="idRegistroAsignacion",nullable=false)
	private Integer idRegistroAsignacion;
	

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idCliente",nullable=false)
	private Cliente cliente;
	

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idPerfil",nullable=false)
	private Perfil perfil;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idArea",nullable=false)
	private Areaa area;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idGerente",nullable=false)
	private GerentesArea gerentesArea;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idLider",nullable=false)
	private LideresConsultor lider;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idGerenteComercial",nullable=false)
	private GerenteComercial gerenteComercial;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idpersona",nullable=false)
	private Persona persona;
	
	@Column(name="ubicacionConsultor",nullable=false)
	private String ubicacionConsultor;
	
	@Column(name="fechaInicioAsignacion",nullable=false)
	private Date fechaInicioAsignacion;
	
	@Column(name="fechaFinAsignacion",nullable=false)
	private Date fechaFinAsignacion;
	
	@Column(name="fechaInicioAnexoAsignacion",nullable=false)
	private Date fechaInicioAnexoAsignacion;
	
	@Column(name="fechaFinAnexoAsignacion",nullable=false)
	private Date fechaFinAnexoAsignacion;
	
	@Column(name="fechaInicioAnexoFacturacion",nullable=false)
	private Date fechaInicioAnexoFacturacion;
	
	@Column(name="fechaFinAnexoFacturacion",nullable=false)
	private Date fechaFinAnexoFacturacion;
	
	@Column(name="horario",nullable=true)
	private String horario;
	
	@Column(name="propuestaEconomica",nullable=false)
	private String propuestaEconomica;
	
	@Column(name="Anexo",nullable=false)
	private String Anexo; 
	
	public RegistroAsignacion(){
		
	}
	
	public RegistroAsignacion(Cliente cliente, Perfil perfil, Areaa area, GerentesArea gerentesArea,
			LideresConsultor lider, GerenteComercial gerenteComercial, Persona persona, String ubicacionConsultor,
			Date fechaInicioAsignacion, Date fechaFinAsignacion, Date fechaInicioAnexoAsignacion,
			Date fechaFinAnexoAsignacion, Date fechaInicioAnexoFacturacion, Date fechaFinAnexoFacturacion,
			String horario, String propuestaEconomica, String anexo) {
		super();
		this.cliente = cliente;
		this.perfil = perfil;
		this.area = area;
		this.gerentesArea = gerentesArea;
		this.lider = lider;
		this.gerenteComercial = gerenteComercial;
		this.persona = persona;
		this.ubicacionConsultor = ubicacionConsultor;
		this.fechaInicioAsignacion = fechaInicioAsignacion;
		this.fechaFinAsignacion = fechaFinAsignacion;
		this.fechaInicioAnexoAsignacion = fechaInicioAnexoAsignacion;
		this.fechaFinAnexoAsignacion = fechaFinAnexoAsignacion;
		this.fechaInicioAnexoFacturacion = fechaInicioAnexoFacturacion;
		this.fechaFinAnexoFacturacion = fechaFinAnexoFacturacion;
		this.horario = horario;
		this.propuestaEconomica = propuestaEconomica;
		Anexo = anexo;
	}
	public RegistroAsignacion(Integer idRegistroAsignacion, Cliente cliente, Perfil perfil, Areaa area,
			GerentesArea gerentesArea, LideresConsultor lider, GerenteComercial gerenteComercial, Persona persona,
			String ubicacionConsultor, Date fechaInicioAsignacion, Date fechaFinAsignacion,
			Date fechaInicioAnexoAsignacion, Date fechaFinAnexoAsignacion, Date fechaInicioAnexoFacturacion,
			Date fechaFinAnexoFacturacion, String horario, String propuestaEconomica, String anexo) {
		super();
		this.idRegistroAsignacion = idRegistroAsignacion;
		this.cliente = cliente;
		this.perfil = perfil;
		this.area = area;
		this.gerentesArea = gerentesArea;
		this.lider = lider;
		this.gerenteComercial = gerenteComercial;
		this.persona = persona;
		this.ubicacionConsultor = ubicacionConsultor;
		this.fechaInicioAsignacion = fechaInicioAsignacion;
		this.fechaFinAsignacion = fechaFinAsignacion;
		this.fechaInicioAnexoAsignacion = fechaInicioAnexoAsignacion;
		this.fechaFinAnexoAsignacion = fechaFinAnexoAsignacion;
		this.fechaInicioAnexoFacturacion = fechaInicioAnexoFacturacion;
		this.fechaFinAnexoFacturacion = fechaFinAnexoFacturacion;
		this.horario = horario;
		this.propuestaEconomica = propuestaEconomica;
		Anexo = anexo;
	}
	
	public Integer getIdRegistroAsignacion() {
		return idRegistroAsignacion;
	}

	public void setIdRegistroAsignacion(Integer idRegistroAsignacion) {
		this.idRegistroAsignacion = idRegistroAsignacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Areaa getArea() {
		return area;
	}

	public void setArea(Areaa area) {
		this.area = area;
	}

	public GerentesArea getGerentesArea() {
		return gerentesArea;
	}

	public void setGerentesArea(GerentesArea gerentesArea) {
		this.gerentesArea = gerentesArea;
	}

	public LideresConsultor getLider() {
		return lider;
	}

	public void setLider(LideresConsultor lider) {
		this.lider = lider;
	}

	public GerenteComercial getGerenteComercial() {
		return gerenteComercial;
	}

	public void setGerenteComercial(GerenteComercial gerenteComercial) {
		this.gerenteComercial = gerenteComercial;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getUbicacionConsultor() {
		return ubicacionConsultor;
	}

	public void setUbicacionConsultor(String ubicacionConsultor) {
		this.ubicacionConsultor = ubicacionConsultor;
	}

	public Date getFechaInicioAsignacion() {
		return fechaInicioAsignacion;
	}

	public void setFechaInicioAsignacion(Date fechaInicioAsignacion) {
		this.fechaInicioAsignacion = fechaInicioAsignacion;
	}

	public Date getFechaFinAsignacion() {
		return fechaFinAsignacion;
	}

	public void setFechaFinAsignacion(Date fechaFinAsignacion) {
		this.fechaFinAsignacion = fechaFinAsignacion;
	}

	public Date getFechaInicioAnexoAsignacion() {
		return fechaInicioAnexoAsignacion;
	}

	public void setFechaInicioAnexoAsignacion(Date fechaInicioAnexoAsignacion) {
		this.fechaInicioAnexoAsignacion = fechaInicioAnexoAsignacion;
	}

	public Date getFechaFinAnexoAsignacion() {
		return fechaFinAnexoAsignacion;
	}

	public void setFechaFinAnexoAsignacion(Date fechaFinAnexoAsignacion) {
		this.fechaFinAnexoAsignacion = fechaFinAnexoAsignacion;
	}

	public Date getFechaInicioAnexoFacturacion() {
		return fechaInicioAnexoFacturacion;
	}

	public void setFechaInicioAnexoFacturacion(Date fechaInicioAnexoFacturacion) {
		this.fechaInicioAnexoFacturacion = fechaInicioAnexoFacturacion;
	}

	public Date getFechaFinAnexoFacturacion() {
		return fechaFinAnexoFacturacion;
	}

	public void setFechaFinAnexoFacturacion(Date fechaFinAnexoFacturacion) {
		this.fechaFinAnexoFacturacion = fechaFinAnexoFacturacion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getPropuestaEconomica() {
		return propuestaEconomica;
	}

	public void setPropuestaEconomica(String propuestaEconomica) {
		this.propuestaEconomica = propuestaEconomica;
	}

	public String getAnexo() {
		return Anexo;
	}

	public void setAnexo(String anexo) {
		Anexo = anexo;
	}
	
}
