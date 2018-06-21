package com.apirest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.Cliente;
import com.apirest.rest.entity.Persona;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.serviceImp.AsignacionServiceImpl;
import com.apirest.rest.serviceImp.ClienteServiceImpl;
import com.apirest.rest.serviceImp.PersonaServiceImpl;

@RestController
public class ControlerAsig {
	
	@Autowired
	@Qualifier("personaServiceImpl")
	private PersonaServiceImpl personaServiceImpl;
	
	@Autowired
	@Qualifier("asignacionServiceImpl")
	private AsignacionServiceImpl asignacionServiceImpl;
	
	@RequestMapping(value="/repPerAsig", method=RequestMethod.GET )
	public ResponseEntity<Persona> showClientes(){
		List<RegistroAsignacion> lAsig= asignacionServiceImpl.ShowAsig();
		List<Persona> persona= new ArrayList<Persona>();
		for(RegistroAsignacion asignado :lAsig){
			
			if(null!=asignado.getCliente()){
				
				persona.add(asignado.getPersona());
				
			}
		}
		return new ResponseEntity(lClientes, HttpStatus.OK);
	}

}
