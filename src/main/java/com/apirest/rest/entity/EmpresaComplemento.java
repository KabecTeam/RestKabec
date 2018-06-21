package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="empresaComplemento")
public class EmpresaComplemento {

	@Id
	@Column(name="empComplemento",unique=true,nullable=false)
	private int empComplemento;

	@Column(name="tipoComplemento",length=35)
	private String tipoComplemento;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="empresaComplemento")
    private Set<RegistroContrato> registro=new HashSet<RegistroContrato>();

	public EmpresaComplemento(int empComplemento, String tipoComplemento, Set<RegistroContrato> registro) {
		super();
		this.empComplemento = empComplemento;
		this.tipoComplemento = tipoComplemento;
		this.registro = registro;
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

	public Set<RegistroContrato> getRegistro() {
		return registro;
	}

	public void setRegistro(Set<RegistroContrato> registro) {
		this.registro = registro;
	}
		
}
