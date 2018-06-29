package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Persona;
import com.apirest.rest.entity.RegistroAsignacion;

public interface AsignadosService {
	
	public List<RegistroAsignacion> ShowAsig();
	
	public List<Persona> ShowNoAsig();

}
