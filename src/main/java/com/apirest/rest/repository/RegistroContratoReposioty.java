package com.apirest.rest.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroContrato;

@Repository("registroContratoReposioty")
public interface RegistroContratoReposioty extends JpaRepository<RegistroContrato, Serializable>{

	public abstract RegistroContrato getRegistroContratoBypersonas(Personas personas);
	
}