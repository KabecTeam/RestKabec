package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	@Id
	@Column(name="idPago", unique=true,nullable=false)
	private int idPago;
	
	@Column(name="idCliente", nullable=false)
	private Integer idCliete;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="Anexo", nullable=false)
	private RegistroAsignacion Anexo;
	
	@Column(name="montoPago",nullable=false)
	private Integer montoPago;
	
	@Column(name="deuda", nullable=false)
	private Integer deuda;
	
	@Column(name="pagosFaltante",nullable=false)
	private Integer pagosFaltantes;
	
	@Column(name="fechaMes",nullable=false)
	private String fechaMes;
	  
	
	
	
	

}
