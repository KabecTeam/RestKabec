package com.apirest.rest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.apirest.rest.entity.RegistroAsignacion;

@Entity
@Table(name="perfil")
public class Perfil {

	@Id
	@Column(name="idPerfil",unique=true,nullable=false)
	private int idPerfil;
	@Column(name="tipoPerfil",nullable=false,length=25)
	private String tipoPerfil;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="perfil")
	private Set<RegistroAsignacion> registroAsignacin= new HashSet<RegistroAsignacion>();
	
	//@OneToMany(fetch=FetchType.EAGER,mappedBy="perfil")
	//private Set<Personas> personas=new HashSet<Personas>();
	
		public Set<RegistroAsignacion> getRegistroAsignacin() {
		return registroAsignacin;
	}

	public void setRegistroAsignacin(Set<RegistroAsignacion> registroAsignacin) {
		this.registroAsignacin = registroAsignacin;
	}

		public Perfil(){
		
	}

	public Perfil(int idPerfil, String tipoPerfil) {
		super();
		this.idPerfil = idPerfil;
		this.tipoPerfil = tipoPerfil;
	}

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

}
