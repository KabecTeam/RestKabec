package com.apirest.rest.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facturas")
public class Facturas {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idfactura;
	
	@Column(name="factura",length=30,nullable=false)
	private String factura;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy="facturas")
	private Set<CalendarioPagos> calendarioPagos=new HashSet<CalendarioPagos>();
	
	public Facturas(){
		
	}


	public Facturas(int idfactura, String factura, Set<CalendarioPagos> calendarioPagos) {
		super();
		this.idfactura = idfactura;
		this.factura = factura;
		this.calendarioPagos = calendarioPagos;
	}



	public int getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}


	public Set<CalendarioPagos> getCalendarioPagos() {
		return calendarioPagos;
	}


	public void setCalendarioPagos(Set<CalendarioPagos> calendarioPagos) {
		this.calendarioPagos = calendarioPagos;
	}
	
	
	
}
