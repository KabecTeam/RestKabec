package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.entity.RegistroContrato;

public interface RegistroAsignacionService {
	
public abstract List<RegistroAsignacion> listRegistroAsignacion();

public abstract RegistroAsignacion findIdregistroAsignacion(Integer id);

public abstract RegistroAsignacion findRegistroAsignacion(RegistroAsignacion registroAsignacion);

public abstract RegistroAsignacion findAsignacionByPersona(Personas personas);

public abstract RegistroContrato findIdRegistroContrato(Integer id);

public abstract RegistroContrato findByContratoPersona(Personas persona);

public abstract List<RegistroContrato> listRegistroContrato();

public abstract Personas findByPersona(Personas personas);

public abstract Personas findByIdPersona(Integer id);

public abstract List<Personas> listPersona();

}
