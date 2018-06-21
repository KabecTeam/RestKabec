package com.apirest.rest.entity;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="consultoresEmpresaKabec",uniqueConstraints=@UniqueConstraint
(columnNames={"conEmpKabec"}))
public class ConsultoresEmpresaKabec {

	@Id
	@Column(name="conEmpKabec",unique=true,nullable=false)
	private int conEmpKabec; 
	
	@Column(name="numSS")
	private BigInteger numSS;
	
	@Column(name="infonavit",length=60)
	private String infonavit;
	
	@Column(name="fonacot",length=70)
	private String fonacot;
	@Column(name="noCuenta")
	private BigInteger noCuenta;
	@Column(name="cInterbancaria")
	private BigInteger cInterbancaria;
	@Column(name="pAlimenticia")
	private boolean pAlimenticia;	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idpersona",nullable=false)
	private Personas personas;
	
	
	public ConsultoresEmpresaKabec(){
		
	}

	public ConsultoresEmpresaKabec(int conEmpKabec, BigInteger numSS, String infonavit, String fonacot,
			BigInteger noCuenta, BigInteger cInterbancaria, boolean pAlimenticia) {
		super();
		this.conEmpKabec = conEmpKabec;
		this.numSS = numSS;
		this.infonavit = infonavit;
		this.fonacot = fonacot;
		this.noCuenta = noCuenta;
		this.cInterbancaria = cInterbancaria;
		this.pAlimenticia = pAlimenticia;
	}

	public ConsultoresEmpresaKabec(int conEmpKabec, BigInteger numSS, String infonavit, String fonacot,
			BigInteger noCuenta, BigInteger cInterbancaria, boolean pAlimenticia, Personas personas) {
		super();
		this.conEmpKabec = conEmpKabec;
		this.numSS = numSS;
		this.infonavit = infonavit;
		this.fonacot = fonacot;
		this.noCuenta = noCuenta;
		this.cInterbancaria = cInterbancaria;
		this.pAlimenticia = pAlimenticia;
		this.personas = personas;
	}

	public int getConEmpKabec() {
		return conEmpKabec;
	}

	public void setConEmpKabec(int conEmpKabec) {
		this.conEmpKabec = conEmpKabec;
	}

	public BigInteger getNumSS() {
		return numSS;
	}

	public void setNumSS(BigInteger numSS) {
		this.numSS = numSS;
	}

	public String getInfonavit() {
		return infonavit;
	}

	public void setInfonavit(String infonavit) {
		this.infonavit = infonavit;
	}

	public String getFonacot() {
		return fonacot;
	}

	public void setFonacot(String fonacot) {
		this.fonacot = fonacot;
	}

	public BigInteger getNoCuenta() {
		return noCuenta;
	}

	public void setNoCuenta(BigInteger noCuenta) {
		this.noCuenta = noCuenta;
	}

	public BigInteger getcInterbancaria() {
		return cInterbancaria;
	}

	public void setcInterbancaria(BigInteger cInterbancaria) {
		this.cInterbancaria = cInterbancaria;
	}

	public boolean ispAlimenticia() {
		return pAlimenticia;
	}

	public void setpAlimenticia(boolean pAlimenticia) {
		this.pAlimenticia = pAlimenticia;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}
	
}
