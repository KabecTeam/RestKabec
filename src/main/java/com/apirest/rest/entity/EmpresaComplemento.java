package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresaComplemento")
public class EmpresaComplemento {
	@Id
	@Column(name="empComplemento",unique=true,nullable=false)
	private int empComplemento;

	@Column(name="tipoComplemento",length=35)
	private String tipoComplemento;


	public EmpresaComplemento(int empComplemento, String tipoComplemento) {
		super();
		this.empComplemento = empComplemento;
		this.tipoComplemento = tipoComplemento;
	}
	
	public EmpresaComplemento(){
		
	}

	public int getEmpComplemento() {
		return empComplemento;
	}

	public void setEmpComplemento(int empComplemento) {
		this.empComplemento = empComplemento;
	}

	public String getTipoComplemento() {
		return tipoComplemento;
	}

	public void setTipoComplemento(String tipoComplemento) {
		this.tipoComplemento = tipoComplemento;
	}
		
}
