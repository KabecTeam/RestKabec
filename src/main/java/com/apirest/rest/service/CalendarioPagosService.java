package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.CalendarioPagos;


public interface CalendarioPagosService {
	
	public List<CalendarioPagos> pagos();
	
	public abstract CalendarioPagos registroPagoAnexo(CalendarioPagos calendarioPagos);
	
	
	
	

}
