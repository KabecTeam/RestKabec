package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="calendariopagos")
public class CalendarioPagos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idpago;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="consultor",nullable=false)
	private Personas personas;
	
	
	@Column(name="numeropago")
	private int numeropago;
	
	@Column(name="importe")
	private int importe;
	
	@Column(name="fechafacturacion",length=20)
	private String fechafacturacion;
	
	@Column(name="fechapago",length=20)
	private String fechapago;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idfactura",nullable=false)
	private Facturas facturas;
	
	@Column(name="fechainiciofactura",length=20)
	private String fechainiciofactura;
	
	@Column(name="fechainiciopago",length=20)
	private String fechainiciopago;
	
	@Column(name="pagosfaltantes")
	private int pagosfaltantes;
	
	@Column(name="deuda")
	private int deuda;
	
	@Column(name="saldo")
	private int saldo;
	
	@JsonProperty("Periodo")
	@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idperiodo")
	@JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idperiodo",nullable=true)
	private Periodo periodo;
	
	
	@Column(name="montopago",nullable=true)
	private int montopago;
	
	@JsonProperty("idanexo")
	@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="idanexo")
	@JsonIdentityReference(alwaysAsId = true)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idanexo",nullable=false)
	private Anexo anexo;
	
	
	public CalendarioPagos(){
		
	}


	public CalendarioPagos(int idpago, Personas personas, int numeropago, int importe, String fechafacturacion,
			String fechapago, Facturas facturas, String fechainiciofactura, String fechainiciopago, int pagosfaltantes,
			int deuda, int saldo, Periodo periodo, int montopago, Anexo anexo) {
		super();
		this.idpago = idpago;
		this.personas = personas;
		this.numeropago = numeropago;
		this.importe = importe;
		this.fechafacturacion = fechafacturacion;
		this.fechapago = fechapago;
		this.facturas = facturas;
		this.fechainiciofactura = fechainiciofactura;
		this.fechainiciopago = fechainiciopago;
		this.pagosfaltantes = pagosfaltantes;
		this.deuda = deuda;
		this.saldo = saldo;
		this.periodo = periodo;
		this.montopago = montopago;
		this.anexo = anexo;
	}





	public CalendarioPagos(int idpago, Personas personas, int numeropago, int importe, String fechafacturacion,
			String fechapago, String fechainiciofactura, String fechainiciopago, int pagosfaltantes, int deuda,
			int saldo, int montopago) {
		super();
		this.idpago = idpago;
		this.personas = personas;
		this.numeropago = numeropago;
		this.importe = importe;
		this.fechafacturacion = fechafacturacion;
		this.fechapago = fechapago;
		this.fechainiciofactura = fechainiciofactura;
		this.fechainiciopago = fechainiciopago;
		this.pagosfaltantes = pagosfaltantes;
		this.deuda = deuda;
		this.saldo = saldo;
		this.montopago = montopago;
	}


	public int getIdpago() {
		return idpago;
	}


	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}


	public Personas getPersona() {
		return personas;
	}


	public void setPersona(Personas personas) {
		this.personas = personas;
	}


	public int getNumeropago() {
		return numeropago;
	}


	public void setNumeropago(int numeropago) {
		this.numeropago = numeropago;
	}


	public int getImporte() {
		return importe;
	}


	public void setImporte(int importe) {
		this.importe = importe;
	}


	public String getFechafacturacion() {
		return fechafacturacion;
	}


	public void setFechafacturacion(String fechafacturacion) {
		this.fechafacturacion = fechafacturacion;
	}


	public String getFechapago() {
		return fechapago;
	}


	public void setFechapago(String fechapago) {
		this.fechapago = fechapago;
	}


	public Facturas getFacturas() {
		return facturas;
	}


	public void setFacturas(Facturas facturas) {
		this.facturas = facturas;
	}


	public String getFechainiciofactura() {
		return fechainiciofactura;
	}


	public void setFechainiciofactura(String fechainiciofactura) {
		this.fechainiciofactura = fechainiciofactura;
	}


	public String getFechainiciopago() {
		return fechainiciopago;
	}


	public void setFechainiciopago(String fechainiciopago) {
		this.fechainiciopago = fechainiciopago;
	}


	public int getPagosfaltantes() {
		return pagosfaltantes;
	}


	public void setPagosfaltantes(int pagosfaltantes) {
		this.pagosfaltantes = pagosfaltantes;
	}


	public int getDeuda() {
		return deuda;
	}


	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public Periodo getPeriodo() {
		return periodo;
	}


	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}


	public int getMontopago() {
		return montopago;
	}


	public void setMontopago(int montopago) {
		this.montopago = montopago;
	}


	public Anexo getAnexo() {
		return anexo;
	}


	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}
	
	
	
	
}
