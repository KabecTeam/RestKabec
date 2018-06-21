package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.RegistroAsignacion;

public interface RegistroAsignacionService {

	public abstract List<RegistroAsignacion> listRegistroAsignacion();
	
	public abstract RegistroAsignacion findIdregistroAsignacion(int id);
	
	public abstract RegistroAsignacion findRegistroAsignacion(RegistroAsignacion registroAsignacion);
}
