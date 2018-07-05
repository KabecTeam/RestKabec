package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroAsignacion;

public interface AsignadosService {
	
	public List<RegistroAsignacion> ShowAsig();
	
	public List<Personas> ShowNoAsig();

}
