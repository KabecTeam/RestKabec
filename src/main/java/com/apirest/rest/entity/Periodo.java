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
@Table(name="periodo")
public class Periodo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idperiodo;
	
	@Column(name="periodo",length=25,nullable=false)
	private String periodo;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy="periodo")
	private Set<Anexo> anexo=new HashSet<Anexo>();
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.EAGER,mappedBy="periodo")
	private Set<CalendarioPagos> calendarioPagos=new HashSet<CalendarioPagos>(); 
	
	public Periodo(){
		
	}


	public Periodo(int idperiodo, String periodo, Set<Anexo> anexo, Set<CalendarioPagos> calendarioPagos) {
		super();
		this.idperiodo = idperiodo;
		this.periodo = periodo;
		this.anexo = anexo;
		this.calendarioPagos = calendarioPagos;
	}



	public int getIdperiodo() {
		return idperiodo;
	}

	public void setIdperiodo(int idperiodo) {
		this.idperiodo = idperiodo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Set<Anexo> getAnexo() {
		return anexo;
	}

	public void setAnexo(Set<Anexo> anexo) {
		this.anexo = anexo;
	}


	public Set<CalendarioPagos> getCalendarioPagos() {
		return calendarioPagos;
	}


	public void setCalendarioPagos(Set<CalendarioPagos> calendarioPagos) {
		this.calendarioPagos = calendarioPagos;
	}
	
	
	
}
