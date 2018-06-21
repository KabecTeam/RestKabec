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

@Entity
@Table(name="registrocontrato")
public class RegistroContrato {

	@Id
	@Column(name="idRegistroCont",unique=true,nullable=false)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRegistroCont;
	@Column(name="numRequerimiento",nullable=false,length=30)
	private String numRequerimiento;
	@Column(name="numPoliza",length=40)
	private String numPoliza;
	@Column(name="estConsultor",length=15)
	private String estConsultor;
	@Column(name="sueldo")
    private int sueldo;
	@Column(name="sueldoNomima",nullable=true)
	private int sueldoNomima;
	@Column(name="sueldototal",nullable=true)
	private int sueldototal;
	@Column(name="fechAltImss",length=60)
	private String fechAltImss;
	@Column(name="recontratacion")
	private Boolean recontratacion;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="contratoNomina",nullable=false)
	private ContratoNomina contratoNomina;
	@Column(name="fechininomin",length=60)
	private String fechininomin;
	@Column(name="fechfinnomin",length=60)
	private String fechfinnomin;
	@Column(name="numConsultor",length=15)
	private String numConsultor;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="empresaComplemento",nullable=false)
	private EmpresaComplemento empresaComplemento; 
	@Column(name="fechinicomp",length=60)
	private String fechinicomp;
	@Column(name="fechfincomp",length=60)
	private String fechfincomp;
	@Column(name="fechaIngreso",length=60)
	private String fechaIngreso;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="personas",nullable=false)
	private Personas personas;
	

	public RegistroContrato(int idRegistroCont, String numRequerimiento, String numPoliza, String estConsultor,
			int sueldo, int sueldoNomima, int sueldototal, String fechAltImss, Boolean recontratacion,String fechaIngreso,
			String fechininomin, String fechfinnomin, String numConsultor, String fechinicomp, String fechfincomp) {
		super();
		this.idRegistroCont = idRegistroCont;
		this.numRequerimiento = numRequerimiento;
		this.numPoliza = numPoliza;
		this.estConsultor = estConsultor;
		this.sueldo = sueldo;
		this.sueldoNomima = sueldoNomima;
		this.sueldototal = sueldototal;
		this.fechAltImss = fechAltImss;
		this.recontratacion = recontratacion;
		this.fechininomin = fechininomin;
		this.fechfinnomin = fechfinnomin;
		this.numConsultor = numConsultor;
		this.fechinicomp = fechinicomp;
		this.fechfincomp = fechfincomp;
		this.fechaIngreso=fechaIngreso;
	}


	public RegistroContrato(int idRegistroCont, String numRequerimiento, String numPoliza, String estConsultor,
			int sueldo, int sueldoNomima, int sueldototal, String fechAltImss, Boolean recontratacion,
			ContratoNomina contratoNomina, String fechininomin, String fechfinnomin, String numConsultor,
			EmpresaComplemento empresaComplemento, String fechinicomp, String fechfincomp, Personas personas,String fechaIngreso) {
		super();
		this.idRegistroCont = idRegistroCont;
		this.numRequerimiento = numRequerimiento;
		this.numPoliza = numPoliza;
		this.estConsultor = estConsultor;
		this.sueldo = sueldo;
		this.sueldoNomima = sueldoNomima;
		this.sueldototal = sueldototal;
		this.fechAltImss = fechAltImss;
		this.recontratacion = recontratacion;
		this.contratoNomina = contratoNomina;
		this.fechininomin = fechininomin;
		this.fechfinnomin = fechfinnomin;
		this.numConsultor = numConsultor;
		this.empresaComplemento = empresaComplemento;
		this.fechinicomp = fechinicomp;
		this.fechfincomp = fechfincomp;
		this.personas = personas;
		this.fechaIngreso=fechaIngreso;
	}


	public RegistroContrato(){
		
	}

	public int getIdRegistroCont() {
		return idRegistroCont;
	}

	public void setIdRegistroCont(int idRegistroCont) {
		this.idRegistroCont = idRegistroCont;
	}

	public String getFechAltImss() {
		return fechAltImss;
	}

	public void setFechAltImss(String fechAltImss) {
		this.fechAltImss = fechAltImss;
	}

	public Boolean getRecontratacion() {
		return recontratacion;
	}

	public void setRecontratacion(Boolean recontratacion) {
		this.recontratacion = recontratacion;
	}

	public ContratoNomina getContratoNomina() {
		return contratoNomina;
	}

	public void setContratoNomina(ContratoNomina contratoNomina) {
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

	public EmpresaComplemento getEmpresaComplemento() {
		return empresaComplemento;
	}

	public void setEmpresaComplemento(EmpresaComplemento empresaComplemento) {
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

	public Personas getPersonas() {
		return personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	public String getNumRequerimiento() {
		return numRequerimiento;
	}

	public void setNumRequerimiento(String numRequerimiento) {
		this.numRequerimiento = numRequerimiento;
	}

	public String getNumPoliza() {
		return numPoliza;
	}

	public void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza;
	}

	public String getEstConsultor() {
		return estConsultor;
	}

	public void setEstConsultor(String estConsultor) {
		this.estConsultor = estConsultor;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getNumConsultor() {
		return numConsultor;
	}

	public void setNumConsultor(String numConsultor) {
		this.numConsultor = numConsultor;
	}


	public int getSueldoNomima() {
		return sueldoNomima;
	}


	public void setSueldoNomima(int sueldoNomima) {
		this.sueldoNomima = sueldoNomima;
	}


	public int getSueldototal() {
		return sueldototal;
	}


	public void setSueldototal(int sueldototal) {
		this.sueldototal = sueldototal;
	}
	

	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public String toString() {
		return "RegistroContrato [idRegistroCont=" + idRegistroCont + ", numRequerimiento=" + numRequerimiento
				+ ", numPoliza=" + numPoliza + ", estConsultor=" + estConsultor + ", sueldo=" + sueldo
				+ ", sueldoNomima=" + sueldoNomima + ", sueldototal=" + sueldototal + ", fechAltImss=" + fechAltImss
				+ ", recontratacion=" + recontratacion + ", contratoNomina=" + contratoNomina + ", fechininomin="
				+ fechininomin + ", fechfinnomin=" + fechfinnomin + ", numConsultor=" + numConsultor
				+ ", empresaComplemento=" + empresaComplemento + ", fechinicomp=" + fechinicomp + ", fechfincomp="
				+ fechfincomp + ", fechaIngreso=" + fechaIngreso + ", personas=" + personas + "]";
	}
	
}
