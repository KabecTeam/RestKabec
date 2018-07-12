package com.apirest.rest.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.serviceImp.AsignacionServiceImpl;
import com.apirest.rest.serviceImp.PersonaServiceImpl;

@RestController
public class ControlerAsig {
	 Calendar fechahoy= Calendar.getInstance();
	int fechaactual=Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(fechahoy.getTime()).toString());
	
	@Autowired
	@Qualifier("personaServiceImpl")
	private PersonaServiceImpl personaServiceImpl;
	
	@Autowired
	@Qualifier("asignacionServiceImpl")
	private AsignacionServiceImpl asignacionServiceImpl;
	
	@RequestMapping(value="/repPerAsig", method=RequestMethod.GET )
	public ResponseEntity<Personas> repPerAsig(){
		List<RegistroAsignacion> lAsig= asignacionServiceImpl.ShowAsig();
		List<Personas> persona1= new ArrayList<Personas>();
		
		for(RegistroAsignacion asignado :lAsig){
			
		int fechaFinAsignacion= Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(asignado.getFechaFinAsignacion().getTime()).toString());
		
			
			if(fechaFinAsignacion>=fechaactual){
				System.out.println(fechaactual);
				System.out.println(fechaFinAsignacion);
				System.out.println("ok");
				persona1.add(asignado.getPersona());
				
			}
		}
		return new ResponseEntity(persona1, HttpStatus.OK);
	
		
	}
	
	@RequestMapping(value="/repPerNoAsig", method=RequestMethod.GET )
	public ResponseEntity<Personas> repPerNoAsig(){
		List<Personas> lPersona= asignacionServiceImpl.ShowNoAsig();
		List<Personas> lPersonasNoAsignadas= new ArrayList<Personas>();
		List<RegistroAsignacion> lAsig= asignacionServiceImpl.ShowAsig();
		for(Personas person:lPersona){
			
			if(null==person.getRegistroAsignacion()){
				lPersonasNoAsignadas.add(person);
			}
		}
			for(RegistroAsignacion asignado :lAsig){
				System.out.println("ok");
				int fechaFinAsignacion= Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(asignado.getFechaFinAsignacion().getTime()).toString());
				if(fechaactual>fechaFinAsignacion){
					lPersonasNoAsignadas.add(asignado.getPersona());
				}
			}
			
		
		
		return new ResponseEntity(lPersonasNoAsignadas, HttpStatus.OK);
	}

	@RequestMapping(value="/Asignacion", method=RequestMethod.GET ) 
	public ResponseEntity<RegistroAsignacion> showAsig(){
		List<RegistroAsignacion> llAsig= asignacionServiceImpl.ShowAsig();
		return new ResponseEntity(llAsig,HttpStatus.OK);
		
	}
}
