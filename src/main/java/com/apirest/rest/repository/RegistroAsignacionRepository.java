package com.apirest.rest.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroAsignacion;

@Repository("registroAsignacionRepository")
public interface RegistroAsignacionRepository extends JpaRepository<RegistroAsignacion, Serializable>{

	public abstract RegistroAsignacion getRegistroAsignacionBypersona(Personas personas);
	
}
