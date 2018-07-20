package com.apirest.rest.component;



public class HelperReporteEstatusConsultor {
	
	private String numConsultor;
	private String estatus;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String contratoNomina;
	private String fechininomin;
	private String fechfinnomin;
	private String empresaComplemento;
	private String fechinicomp;
	private String fechfincomp;
	private String area;
	private String lider;
	private String anexo;
	
	
	public HelperReporteEstatusConsultor(){
		
	}

	
	public HelperReporteEstatusConsultor(String nombre,String apellidoPaterno,String apellidoMaterno,String area,String lider
			,String anexo,String numConsultor,String contratoNomina,String fechininomin,String fechfinnomin, 
			String empresaComplemento,String fechinicomp,String estatus){
	this.nombre=nombre;	
	this.apellidoPaterno=apellidoPaterno;
	this.apellidoMaterno=apellidoMaterno;
	this.area=area;
	this.lider=lider;
	this.anexo=anexo;
	this.numConsultor=numConsultor;
	this.contratoNomina=contratoNomina;
	this.fechininomin=fechininomin;
	this.fechfinnomin=fechfinnomin;
	this.empresaComplemento=empresaComplemento;
	this.fechinicomp=fechinicomp;
	this.estatus=estatus;
	}
	

	public String getNumConsultor() {
		return numConsultor;
	}

	public void setNumConsultor(String numConsultor) {
		this.numConsultor = numConsultor;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
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

	public String getContratoNomina() {
		return contratoNomina;
	}

	public void setContratoNomina(String contratoNomina) {
		this.contratoNomina = contratoNomina;
	}

	public String getFechininomin() {
		return fechininomin;
	}

	public void setFechininomin(String fechininomin) {
		this.fechininomin = fechininomin;
	}

	public String getFechfinnomin() {
		return fechfinnomin;
	}

	public void setFechfinnomin(String fechfinnomin) {
		this.fechfinnomin = fechfinnomin;
	}

	public String getEmpresaComplemento() {
		return empresaComplemento;
	}

	public void setEmpresaComplemento(String empresaComplemento) {
		this.empresaComplemento = empresaComplemento;
	}

	public String getFechinicomp() {
		return fechinicomp;
	}

	public void setFechinicomp(String fechinicomp) {
		this.fechinicomp = fechinicomp;
	}

	public String getFechfincomp() {
		return fechfincomp;
	}

	public void setFechfincomp(String fechfincomp) {
		this.fechfincomp = fechfincomp;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	@Override
	public String toString() {
		return "HelperReporteEstatusConsultor [numConsultor=" + numConsultor + ", estatus=" + estatus + ", nombre="
				+ nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", contratoNomina=" + contratoNomina + ", fechininomin=" + fechininomin + ", fechfinnomin="
				+ fechfinnomin + ", empresaComplemento=" + empresaComplemento + ", fechinicomp=" + fechinicomp
				+ ", fechfincomp=" + fechfincomp + ", area=" + area + ", lider=" + lider + ", anexo=" + anexo + "]";
	}

	
	
	
	
	
}