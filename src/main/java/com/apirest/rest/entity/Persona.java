package com.apirest.rest.entity;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.udemy.backend.entity.Bancos;
import com.udemy.backend.entity.Certificaciones;
import com.udemy.backend.entity.ConsultorExpediente;
import com.udemy.backend.entity.ConsultoresEmpresaKabec;
import com.udemy.backend.entity.Domicilio;
import com.udemy.backend.entity.Escolaridad;
import com.udemy.backend.entity.EstadoCivil;
import com.udemy.backend.entity.Genero;
import com.udemy.backend.entity.RefPersonales;
import com.udemy.backend.entity.RegistroAsignacion;
import com.udemy.backend.entity.RegistroContrato;


@Entity
@Table(name="personas")

public class Persona {
	
	@Id
	@GeneratedValue
	@Column(name="idpersona",unique=true,nullable=false)
		private int idpersona;

	@Column(name="nombre",nullable=false,length=80)
	private String nombre;

	@Column(name="apellidoPaterno",nullable=false,length=80)
	private String apellidoPaterno;

	@Column(name="apellidoMaterno",nullable=false,length=80)
	private String apellidoMaterno;

	@Column(name="fechaNacimiento",nullable=false)
	@DateTimeFormat(pattern="YYYY-mm-dd")
	private String fechaNacimiento; 

	@Column(name="rfc",nullable=false,length=18)
	private String rfc;

	@Column(name="curp",nullable=false,length=24)
	private String curp;

	@Column(name="correo",length=80)
	private String correo;

	@Column(name="edad", nullable=false,length=3)
	private Integer edad;

	@Override
	public String toString() {
		return "Personas [idpersona=" + idpersona + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", rfc=" + rfc
				+ ", curp=" + curp + ", correo=" + correo + ", edad=" + edad + ", telparticular=" + telparticular
				+ ", telCelular=" + telCelular + ", numSS=" + numSS + ", credInf=" + credInf + ", creFonacot=" + creFonacot
				+ ", claveInter=" + claveInter + ", pension=" + pension + ", bancos=" + bancos + ", genero=" + genero
				+ ", estadocivil=" + estadocivil + ", consultoresEmpresaKabec=" + consultoresEmpresaKabec + ", escolaridad="
				+ escolaridad + ", domicilio=" + domicilio + ", refPersonales=" + refPersonales + ", datosFamiliares="
				+ datosFamiliares + ", registroAsignacion=" + registroAsignacion + ", registroContrato=" + registroContrato
				+ ", certificaciones=" + certificaciones + "]";
	}


	@Column(name="telparticular",length=18)
	private String telparticular;

	@Column(name="telCelular",length=18)
	private String telCelular;

	@Column(name="numSS")
	private BigInteger numSS;

	@Column(name="credInf")
	private BigInteger credInf;

	@Column(name="creFonacot")
	private BigInteger creFonacot;

	@Column(name="claveInter")
	private BigInteger claveInter;

	@Column(name="pension")
	private Boolean pension;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="bancos",nullable=false)
	private Bancos bancos;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idgenero",nullable=false)
	private Genero genero;


	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idEstadoCivil",nullable=false)
	private EstadoCivil estadocivil;

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<ConsultoresEmpresaKabec> consultoresEmpresaKabec=new HashSet<ConsultoresEmpresaKabec>();

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<Escolaridad> escolaridad=new HashSet<Escolaridad>();

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<Domicilio> domicilio=new HashSet<>();

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<RefPersonales> refPersonales=new HashSet<RefPersonales>();

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<ConsultorExpediente> datosFamiliares=new HashSet<ConsultorExpediente>();

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "persona")
	private Set<RegistroAsignacion> registroAsignacion = new HashSet<RegistroAsignacion>();

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<RegistroContrato> registroContrato=new HashSet<RegistroContrato>();

	@OneToMany(fetch=FetchType.EAGER,mappedBy="personas")
	private Set<Certificaciones> certificaciones=new HashSet<Certificaciones>();


	public Personas(){
		
	}


	public Personas(int idpersona, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento,
			String rfc, String curp, String correo, Integer edad, String telparticular, String telCelular, BigInteger numSS,
			BigInteger credInf, BigInteger creFonacot, BigInteger claveInter, Boolean pension) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.rfc = rfc;
		this.curp = curp;
		this.correo = correo;
		this.edad = edad;
		this.telparticular = telparticular;
		this.telCelular = telCelular;
		this.numSS = numSS;
		this.credInf = credInf;
		this.creFonacot = creFonacot;
		this.claveInter = claveInter;
		this.pension = pension;
	}

	public Personas(int idpersona, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento,
			String rfc, String curp, String correo, Integer edad, String telparticular, String telCelular, BigInteger numSS,
			BigInteger credInf, BigInteger creFonacot, BigInteger claveInter, Boolean pension, Bancos bancos, Genero genero,
			EstadoCivil estadocivil, Set<ConsultoresEmpresaKabec> consultoresEmpresaKabec, Set<Escolaridad> escolaridad,
			Set<Domicilio> domicilio, Set<RefPersonales> refPersonales, Set<ConsultorExpediente> datosFamiliares,
			Set<RegistroAsignacion> registroAsignacion, Set<RegistroContrato> registroContrato,
			Set<Certificaciones> certificaciones) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.rfc = rfc;
		this.curp = curp;
		this.correo = correo;
		this.edad = edad;
		this.telparticular = telparticular;
		this.telCelular = telCelular;
		this.numSS = numSS;
		this.credInf = credInf;
		this.creFonacot = creFonacot;
		this.claveInter = claveInter;
		this.pension = pension;
		this.bancos = bancos;
		this.genero = genero;
		this.estadocivil = estadocivil;
		this.consultoresEmpresaKabec = consultoresEmpresaKabec;
		this.escolaridad = escolaridad;
		this.domicilio = domicilio;
		this.refPersonales = refPersonales;
		this.datosFamiliares = datosFamiliares;
		this.registroAsignacion = registroAsignacion;
		this.registroContrato = registroContrato;
		this.certificaciones = certificaciones;
	}


	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTelparticular() {
		return telparticular;
	}

	public void setTelparticular(String telparticular) {
		this.telparticular = telparticular;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}


	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}


	public BigInteger getNumSS() {
		return numSS;
	}


	public void setNumSS(BigInteger numSS) {
		this.numSS = numSS;
	}


	public BigInteger getCredInf() {
		return credInf;
	}


	public void setCredInf(BigInteger credInf) {
		this.credInf = credInf;
	}


	public BigInteger getCreFonacot() {
		return creFonacot;
	}


	public void setCreFonacot(BigInteger creFonacot) {
		this.creFonacot = creFonacot;
	}


	public Bancos getBancos() {
		return bancos;
	}


	public void setBancos(Bancos bancos) {
		this.bancos = bancos;
	}


	public Set<ConsultoresEmpresaKabec> getConsultoresEmpresaKabec() {
		return consultoresEmpresaKabec;
	}


	public void setConsultoresEmpresaKabec(Set<ConsultoresEmpresaKabec> consultoresEmpresaKabec) {
		this.consultoresEmpresaKabec = consultoresEmpresaKabec;
	}


	public BigInteger getClaveInter() {
		return claveInter;
	}


	public void setClaveInter(BigInteger claveInter) {
		this.claveInter = claveInter;
	}


	public Boolean getPension() {
		return pension;
	}


	public void setPension(Boolean pension) {
		this.pension = pension;
	}


	public Set<Escolaridad> getEscolaridad() {
		return escolaridad;
	}


	public void setEscolaridad(Set<Escolaridad> escolaridad) {
		this.escolaridad = escolaridad;
	}


	public Set<Domicilio> getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(Set<Domicilio> domicilio) {
		this.domicilio = domicilio;
	}


	public Set<RefPersonales> getRefPersonales() {
		return refPersonales;
	}


	public void setRefPersonales(Set<RefPersonales> refPersonales) {
		this.refPersonales = refPersonales;
	}


	public Set<ConsultorExpediente> getDatosFamiliares() {
		return datosFamiliares;
	}


	public void setDatosFamiliares(Set<ConsultorExpediente> datosFamiliares) {
		this.datosFamiliares = datosFamiliares;
	}


	public Set<RegistroAsignacion> getRegistroAsignacion() {
		return registroAsignacion;
	}


	public void setRegistroAsignacion(Set<RegistroAsignacion> registroAsignacion) {
		this.registroAsignacion = registroAsignacion;
	}


	public Set<RegistroContrato> getRegistroContrato() {
		return registroContrato;
	}


	public void setRegistroContrato(Set<RegistroContrato> registroContrato) {
		this.registroContrato = registroContrato;
	}


	public Set<Certificaciones> getCertificaciones() {
		return certificaciones;
	}


	public void setCertificaciones(Set<Certificaciones> certificaciones) {
		this.certificaciones = certificaciones;
	}


}
