package com.apirest.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.Personas;

@Repository("personasRepository")
public interface PersonasRepository extends JpaRepository<Personas, Serializable>{

	public abstract Personas idpersona(Personas personas);
	
}
