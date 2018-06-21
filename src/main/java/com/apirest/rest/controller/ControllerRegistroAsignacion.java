package com.apirest.rest.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.catalina.Session;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.service.RegistroAsignacionService;

@RestController
public class ControllerRegistroAsignacion {

	@Autowired
	@Qualifier("registroAsigServiceImpl")
	public RegistroAsignacionService registroAsignacionService; 

	private static final Log LOG=LogFactory.getLog(ControllerRegistroAsignacion.class);
	//RegistroAsignacion registroAsig=new RegistroAsignacion();
	
	
	@RequestMapping(value="/listAsig",method=RequestMethod.GET)
	public ResponseEntity<RegistroAsignacion> ListAllRegisAsig() throws ParseException{
		Date date=new Date();
		List<RegistroAsignacion> registroAsignacion=registroAsignacionService.listRegistroAsignacion();
		
		
		for(RegistroAsignacion ListRegistro:registroAsignacion){
            SimpleDateFormat parseador = new SimpleDateFormat("dd-MM-yy");
            SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			date=parseador.parse(String.valueOf(ListRegistro.getFechaFinAsignacion()));
			//Date datenow=parseador.parse(String.valueOf(new Date()));
			LOG.info("Registro"+formateador.format(date));
			LOG.info("Date now:"+timeStamp);
			//ListRegistro.setUbicacionConsultor("Externo");
			//String registro=ListRegistro.getUbicacionConsultor();
			String registro="Externo";
			//while(ListRegistro.getUbicacionConsultor()==registro){
			if(ListRegistro.getUbicacionConsultor().equals(registro)){
				//registroAsignacion=registroAsignacionService.listRegistroAsignacion();		
				LOG.info("Registro"+ListRegistro.getUbicacionConsultor());
				
				ListRegistro.setUbicacionConsultor("1");
			}else{
				LOG.info("Registro"+ListRegistro.getUbicacionConsultor());
				ListRegistro.setUbicacionConsultor("2");	
			}
			//}	
			//LOG.info("La fecha es:"+fechaIni);	
		}
		return new ResponseEntity(registroAsignacion,HttpStatus.OK);
	}

	@RequestMapping(value="/findIdRegistro/{id}",method=RequestMethod.GET)
	public ResponseEntity<RegistroAsignacion> findIdRegistAsig(@PathVariable("id")int id){
		RegistroAsignacion registroAsig=registroAsignacionService.findIdregistroAsignacion(id);
		LOG.info("El horario es:"+registroAsig.getHorario());
		return new ResponseEntity(registroAsig,HttpStatus.OK);
	}
	
}
