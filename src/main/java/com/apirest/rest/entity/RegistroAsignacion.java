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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="registroAsignacion")
public class RegistroAsignacion {

	@Id
	@GeneratedValue
	@Column(name="idRegistroAsignacion",nullable=false)
	private Integer idRegistroAsignacion;
	
	@JsonProperty("idCliente")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idCliente")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idCliente",nullable=false)
	private Cliente cliente;

	
	@JsonProperty("idPerfil")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tipoPerfil")
    @JsonIdentityReference(alwaysAsId = true)@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idPerfil",nullable=false)
	private Perfil perfil;
	
	@JsonProperty("idArea")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nombreArea")
    @JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idArea",nullable=false)
	private Area area;
	
	@JsonProperty("idGerente")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nombre")
    @JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idGerente",nullable=false)
	private GerentesArea gerentesArea;
	
	@JsonProperty("idLider")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nombre")
    @JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idLider",nullable=false)
	private LideresConsultor lider;
	
	@JsonProperty("idGerenteComercial")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nombre")
    @JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idGerenteComercial",nullable=false)
	private GerenteComercial gerenteComercial;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idpersona",nullable=false)
	private Personas persona;
	
	@Column(name="ubicacionConsultor",nullable=false)
	private String ubicacionConsultor;
	
	
	@Column(name="fechaInicioAsignacion",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaInicioAsignacion;
	
	@Column(name="fechaFinAsignacion",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaFinAsignacion;
	
	@Column(name="fechaInicioAnexoAsignacion",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaInicioAnexoAsignacion;
	
	@Column(name="fechaFinAnexoAsignacion",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaFinAnexoAsignacion;
	
	@Column(name="fechaInicioAnexoFacturacion",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaInicioAnexoFacturacion;
	
	@Column(name="fechaFinAnexoFacturacion",nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fechaFinAnexoFacturacion;
	
	@Column(name="horario",nullable=true)
	private String horario;
	
	@Column(name="propuestaEconomica",nullable=false)
	private String propuestaEconomica;
		
	@JsonProperty("idanexo")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idanexo")
    @JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idanexo",nullable=false)
	private Anexo anexo;
	
	
	public RegistroAsignacion(){
		
	}
	
	
	public RegistroAsignacion(Integer idRegistroAsignacion, Cliente cliente, Perfil perfil, Area area,
			GerentesArea gerentesArea, LideresConsultor lider, GerenteComercial gerenteComercial, Personas persona,
			String ubicacionConsultor, Date fechaInicioAsignacion, Date fechaFinAsignacion,
			Date fechaInicioAnexoAsignacion, Date fechaFinAnexoAsignacion, Date fechaInicioAnexoFacturacion,
			Date fechaFinAnexoFacturacion, String horario, String propuestaEconomica, Anexo anexo) {
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
		this.anexo = anexo;
	}



	public RegistroAsignacion(Integer idRegistroAsignacion, Cliente cliente, Perfil perfil, Area area,
			GerentesArea gerentesArea, LideresConsultor lider, GerenteComercial gerenteComercial, Personas persona,
			String ubicacionConsultor, Date fechaInicioAsignacion, Date fechaFinAsignacion,
			Date fechaInicioAnexoAsignacion, Date fechaFinAnexoAsignacion, Date fechaInicioAnexoFacturacion,
			Date fechaFinAnexoFacturacion, String horario, String propuestaEconomica) {
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
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

	public Personas getPersona() {
		return persona;
	}

	public void setPersona(Personas persona) {
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

	
	public Anexo getAnexo() {
		return anexo;
	}


	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}


	@Override
	public String toString() {
		return "RegistroAsignacion [idRegistroAsignacion=" + idRegistroAsignacion + ", cliente=" + cliente + ", perfil="
				+ perfil + ", area=" + area + ", gerentesArea=" + gerentesArea + ", lider=" + lider
				+ ", gerenteComercial=" + gerenteComercial + ", persona=" + persona + ", ubicacionConsultor="
				+ ubicacionConsultor + ", fechaInicioAsignacion=" + fechaInicioAsignacion + ", fechaFinAsignacion="
				+ fechaFinAsignacion + ", fechaInicioAnexoAsignacion=" + fechaInicioAnexoAsignacion
				+ ", fechaFinAnexoAsignacion=" + fechaFinAnexoAsignacion + ", fechaInicioAnexoFacturacion="
				+ fechaInicioAnexoFacturacion + ", fechaFinAnexoFacturacion=" + fechaFinAnexoFacturacion + ", horario="
				+ horario + ", propuestaEconomica=" + propuestaEconomica + ", anexo=" + anexo + "]";
	}

	
}
