package com.apirest.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consultorExpediente")
public class ConsultorExpediente {

	@Id
	@GeneratedValue
	@Column(name = "idExpediente")
	private Integer idExpediente;

	@Column(name = "fotoInfantil")
	private boolean fotoInfantil;

	@Column(name = "actaNacimiento")
	private boolean actaNacimiento;

	@Column(name = "platicaInduccion")
	private boolean platicaInduccion;

	@Column(name = "cuentaAfore")
	private boolean cuentaAfore;

	@Column(name = "ine")
	private boolean ine;

	@Column(name = "comprobanteDomicilio")
	private boolean comprobanteDomicilio;

	@Column(name = "cartaRetencionInfonavit")
	private boolean cartaRetencionInfonavit;

	@Column(name = "cartaAntecedentesNoPenales")
	private boolean cartaAntecedentesNoPenales;

	@Column(name = "cedulaProfesionalOComprobanteEstudios")
	private boolean cedulaProfesionalOComprobanteEstudios;

	@Column(name = "numeroSeguridadSocial")
	private boolean numeroSeguridadSocial;

	@Column(name = "cartaRecomendacion")
	private boolean cartaRecomendacion;

	@Column(name = "cartaDatosBancariosOEstadoDeCuenta")
	private boolean cartaDatosBancariosOEstadoDeCuenta;

	@Column(name = "fonacot")
	private boolean fonacot;

	@Column(name = "pesionAlimenticia")
	private boolean pesionAlimenticia;

	@Column(name = "curp")
	private boolean curp;

	@Column(name = "rfc")
	private boolean rfc;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idpersona", nullable = false)
	private Personas personas;

	public ConsultorExpediente() {
	}

	public ConsultorExpediente(boolean fotoInfantil, boolean actaNacimiento, boolean platicaInduccion,
			boolean cuentaAfore, boolean ine, boolean comprobanteDomicilio, boolean cartaRetencionInfonavit,
			boolean cartaAntecedentesNoPenales, boolean cedulaProfesionalOComprobanteEstudios,
			boolean numeroSeguridadSocial, boolean cartaRecomendacion, boolean cartaDatosBancariosOEstadoDeCuenta,
			boolean fonacot, boolean pesionAlimenticia, boolean curp, boolean rfc, Personas personas) {
		super();
		this.fotoInfantil = fotoInfantil;
		this.actaNacimiento = actaNacimiento;
		this.platicaInduccion = platicaInduccion;
		this.cuentaAfore = cuentaAfore;
		this.ine = ine;
		this.comprobanteDomicilio = comprobanteDomicilio;
		this.cartaRetencionInfonavit = cartaRetencionInfonavit;
		this.cartaAntecedentesNoPenales = cartaAntecedentesNoPenales;
		this.cedulaProfesionalOComprobanteEstudios = cedulaProfesionalOComprobanteEstudios;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.cartaRecomendacion = cartaRecomendacion;
		this.cartaDatosBancariosOEstadoDeCuenta = cartaDatosBancariosOEstadoDeCuenta;
		this.fonacot = fonacot;
		this.pesionAlimenticia = pesionAlimenticia;
		this.curp = curp;
		this.rfc = rfc;
		this.personas = personas;
	}

	public ConsultorExpediente(Integer idExpediente, boolean fotoInfantil, boolean actaNacimiento,
			boolean platicaInduccion, boolean cuentaAfore, boolean ine, boolean comprobanteDomicilio,
			boolean cartaRetencionInfonavit, boolean cartaAntecedentesNoPenales,
			boolean cedulaProfesionalOComprobanteEstudios, boolean numeroSeguridadSocial, boolean cartaRecomendacion,
			boolean cartaDatosBancariosOEstadoDeCuenta, boolean fonacot, boolean pesionAlimenticia, boolean curp,
			boolean rfc, Personas personas) {
		super();
		this.idExpediente = idExpediente;
		this.fotoInfantil = fotoInfantil;
		this.actaNacimiento = actaNacimiento;
		this.platicaInduccion = platicaInduccion;
		this.cuentaAfore = cuentaAfore;
		this.ine = ine;
		this.comprobanteDomicilio = comprobanteDomicilio;
		this.cartaRetencionInfonavit = cartaRetencionInfonavit;
		this.cartaAntecedentesNoPenales = cartaAntecedentesNoPenales;
		this.cedulaProfesionalOComprobanteEstudios = cedulaProfesionalOComprobanteEstudios;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.cartaRecomendacion = cartaRecomendacion;
		this.cartaDatosBancariosOEstadoDeCuenta = cartaDatosBancariosOEstadoDeCuenta;
		this.fonacot = fonacot;
		this.pesionAlimenticia = pesionAlimenticia;
		this.curp = curp;
		this.rfc = rfc;
		this.personas = personas;
	}

	public Integer getIdExpediente() {
		return idExpediente;
	}

	public void setIdExpediente(Integer idExpediente) {
		this.idExpediente = idExpediente;
	}

	public boolean isFotoInfantil() {
		return fotoInfantil;
	}

	public void setFotoInfantil(boolean fotoInfantil) {
		this.fotoInfantil = fotoInfantil;
	}

	public boolean isActaNacimiento() {
		return actaNacimiento;
	}

	public void setActaNacimiento(boolean actaNacimiento) {
		this.actaNacimiento = actaNacimiento;
	}

	public boolean isPlaticaInduccion() {
		return platicaInduccion;
	}

	public void setPlaticaInduccion(boolean platicaInduccion) {
		this.platicaInduccion = platicaInduccion;
	}

	public boolean isCuentaAfore() {
		return cuentaAfore;
	}

	public void setCuentaAfore(boolean cuentaAfore) {
		this.cuentaAfore = cuentaAfore;
	}

	public boolean isIne() {
		return ine;
	}

	public void setIne(boolean ine) {
		this.ine = ine;
	}

	public boolean isComprobanteDomicilio() {
		return comprobanteDomicilio;
	}

	public void setComprobanteDomicilio(boolean comprobanteDomicilio) {
		this.comprobanteDomicilio = comprobanteDomicilio;
	}

	public boolean isCartaRetencionInfonavit() {
		return cartaRetencionInfonavit;
	}

	public void setCartaRetencionInfonavit(boolean cartaRetencionInfonavit) {
		this.cartaRetencionInfonavit = cartaRetencionInfonavit;
	}

	public boolean isCartaAntecedentesNoPenales() {
		return cartaAntecedentesNoPenales;
	}

	public void setCartaAntecedentesNoPenales(boolean cartaAntecedentesNoPenales) {
		this.cartaAntecedentesNoPenales = cartaAntecedentesNoPenales;
	}

	public boolean isCedulaProfesionalOComprobanteEstudios() {
		return cedulaProfesionalOComprobanteEstudios;
	}

	public void setCedulaProfesionalOComprobanteEstudios(boolean cedulaProfesionalOComprobanteEstudios) {
		this.cedulaProfesionalOComprobanteEstudios = cedulaProfesionalOComprobanteEstudios;
	}

	public boolean isNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(boolean numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public boolean isCartaRecomendacion() {
		return cartaRecomendacion;
	}

	public void setCartaRecomendacion(boolean cartaRecomendacion) {
		this.cartaRecomendacion = cartaRecomendacion;
	}

	public boolean isCartaDatosBancariosOEstadoDeCuenta() {
		return cartaDatosBancariosOEstadoDeCuenta;
	}

	public void setCartaDatosBancariosOEstadoDeCuenta(boolean cartaDatosBancariosOEstadoDeCuenta) {
		this.cartaDatosBancariosOEstadoDeCuenta = cartaDatosBancariosOEstadoDeCuenta;
	}

	public boolean isFonacot() {
		return fonacot;
	}

	public void setFonacot(boolean fonacot) {
		this.fonacot = fonacot;
	}

	public boolean isPesionAlimenticia() {
		return pesionAlimenticia;
	}

	public void setPesionAlimenticia(boolean pesionAlimenticia) {
		this.pesionAlimenticia = pesionAlimenticia;
	}

	public boolean isCurp() {
		return curp;
	}

	public void setCurp(boolean curp) {
		this.curp = curp;
	}

	public boolean isRfc() {
		return rfc;
	}

	public void setRfc(boolean rfc) {
		this.rfc = rfc;
	}

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

}
