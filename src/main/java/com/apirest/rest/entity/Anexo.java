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
@Table(name="anexo")
public class Anexo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idanexo;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idCliente",nullable=false)
	private Cliente cliente;
	
	@Column(name="anexooc",length=200)
	private String anexooc;
	
	@Column(name="descripcion",length=200)
	private String descripcion;
	
	@Column(name="fechaInicio",length=20)
	private String fechaInicio;
	
	@Column(name="fechaFin",length=20)
	private String fechaFin;
	
	@Column(name="tarifa")
	private Float tarifa;
	
	@Column(name="numeropagos")
	private int numeropagos;
	
	@Column(name="vobo",length=50)
	private String vobo;
	
	@Column(name="clavepresupuestal",length=50)
	private String clavepresupuestal;
	
	@Column(name="importeanexo")
	private Float importeanexo;
	
	@Column(name="condicionespago",length=200)
	private String condicionespago;
	
	@Column(name="observaciones",length=200)
	private String observaciones;
	
	@Column(name="montoxpago")
	private int montoxpago;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idperiodo",nullable=false)
	private Periodo periodo;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="anexo")
	private Set<CalendarioPagos> calendarioPagos=new HashSet<CalendarioPagos>();
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="anexo")
	private Set<RegistroAsignacion> registroAsignacion=new HashSet<RegistroAsignacion>(); 
	
	
	




	public Anexo(int idanexo, Cliente cliente, String anexooc, String descripcion, String fechaInicio, String fechaFin,
			Float tarifa, int numeropagos, String vobo, String clavepresupuestal, Float importeanexo,
			String condicionespago, String observaciones, int montoxpago, Periodo periodo,
			Set<CalendarioPagos> calendarioPagos, Set<RegistroAsignacion> registroAsignacion) {
		super();
		this.idanexo = idanexo;
		this.cliente = cliente;
		this.anexooc = anexooc;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tarifa = tarifa;
		this.numeropagos = numeropagos;
		this.vobo = vobo;
		this.clavepresupuestal = clavepresupuestal;
		this.importeanexo = importeanexo;
		this.condicionespago = condicionespago;
		this.observaciones = observaciones;
		this.montoxpago = montoxpago;
		this.periodo = periodo;
		this.calendarioPagos = calendarioPagos;
		this.registroAsignacion = registroAsignacion;
	}



	public Anexo(int idanexo,String anexooc, String descripcion, String fechaInicio, String fechaFin,
			Float tarifa, int numeropagos, String vobo, String clavepresupuestal, Float importeanexo,
			String condicionespago, String observaciones, int montoxpago,Set<CalendarioPagos> calendarioPagos,
			Set<RegistroAsignacion> registroAsignacion) {
		super();
		this.idanexo = idanexo;
		this.anexooc = anexooc;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tarifa = tarifa;
		this.numeropagos = numeropagos;
		this.vobo = vobo;
		this.clavepresupuestal = clavepresupuestal;
		this.importeanexo = importeanexo;
		this.condicionespago = condicionespago;
		this.observaciones = observaciones;
		this.montoxpago = montoxpago;
		this.calendarioPagos = calendarioPagos;
		this.registroAsignacion = registroAsignacion;
	}



	public Anexo(){
		
	}

	public int getIdanexo() {
		return idanexo;
	}

	public void setIdanexo(int idanexo) {
		this.idanexo = idanexo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getAnexooc() {
		return anexooc;
	}

	public void setAnexooc(String anexooc) {
		this.anexooc = anexooc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Float getTarifa() {
		return tarifa;
	}

	public void setTarifa(Float tarifa) {
		this.tarifa = tarifa;
	}

	public int getNumeropagos() {
		return numeropagos;
	}

	public void setNumeropagos(int numeropagos) {
		this.numeropagos = numeropagos;
	}

	public String getVobo() {
		return vobo;
	}

	public void setVobo(String vobo) {
		this.vobo = vobo;
	}

	public String getClavepresupuestal() {
		return clavepresupuestal;
	}

	public void setClavepresupuestal(String clavepresupuestal) {
		this.clavepresupuestal = clavepresupuestal;
	}

	public Float getImporteanexo() {
		return importeanexo;
	}

	public void setImporteanexo(Float importeanexo) {
		this.importeanexo = importeanexo;
	}

	public String getCondicionespago() {
		return condicionespago;
	}

	public void setCondicionespago(String condicionespago) {
		this.condicionespago = condicionespago;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getMontoxpago() {
		return montoxpago;
	}

	public void setMontoxpago(int montoxpago) {
		this.montoxpago = montoxpago;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}



	public Set<CalendarioPagos> getCalendarioPagos() {
		return calendarioPagos;
	}



	public void setCalendarioPagos(Set<CalendarioPagos> calendarioPagos) {
		this.calendarioPagos = calendarioPagos;
	}



	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}



	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}
	
	
	
}
