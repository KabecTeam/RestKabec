package com.apirest.rest.controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.service.RegistroAsignacionService;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.entity.RegistroContrato;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/reporteasignacion"})
public class RegistroAsignacionController {
	
	@Autowired
	@Qualifier("registroAsigServiceImpl")
	private RegistroAsignacionService registroAsignacionService;
	
	private static final Log LOG=LogFactory.getLog(RegistroAsignacionController.class);

	@GetMapping
	public List<RegistroAsignacion> ListAllRegistro() throws ParseException{
		
		List<RegistroAsignacion> registroAsignacion=registroAsignacionService.listRegistroAsignacion();
		
		for(RegistroAsignacion ListRegistro:registroAsignacion){
			//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); //yyyy/MM/dd
			//Date fechaInicioAsignacion=formatter.parse(String.valueOf(ListRegistro.getFechaInicioAsignacion()));
			
			//LOG.info("La fecha es:"+fechaInicioAsignacion);
			//ListRegistro.setFechaInicioAsignacion(fechaInicioAsignacion);
			
            Calendar calendar=Calendar.getInstance();
            Calendar calendardate=Calendar.getInstance();
            calendar.add(Calendar.DATE, +45);
            String timeStamp45 = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
            String timeStampHoy=new SimpleDateFormat("yyyyMMdd").format(calendardate.getTime().getTime());
            String timeStampfechAsig = new SimpleDateFormat("yyyyMMdd").format(ListRegistro.getFechaFinAsignacion().getTime());
            int time45=Integer.parseInt(timeStamp45);
            int timeHoy=Integer.parseInt(timeStampHoy);
            int timefechAsig=Integer.parseInt(timeStampfechAsig);
            LOG.info("Date now time24:"+time45);
			LOG.info("Date now timeHoy:"+timeHoy);
 			LOG.info("Date now timefechAsig:"+timefechAsig);
			if(timeHoy>=timefechAsig){
				LOG.info("Registro"+ListRegistro.getUbicacionConsultor());
				ListRegistro.setUbicacionConsultor("Contrato vencido");
			}else{				
			if(time45>=timefechAsig && timefechAsig<=time45){	
				LOG.info("Registro"+ListRegistro.getUbicacionConsultor());
				ListRegistro.setUbicacionConsultor("Contrato por vencer");
			}else{
				LOG.info("Registro"+ListRegistro.getUbicacionConsultor());
				ListRegistro.setUbicacionConsultor("Contrato vigente");
			}
				
			}	
		}
		return registroAsignacion;
	}
	
	public Date dateConverter(String fecha){
		Date parsedDate= null;
		try{
			
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		parsedDate =  dateFormat.parse(fecha);
		
		//LOG.info("*****************************************************");
		//LOG.info("En dateConverter -> "+ dateFormat.parse((dateFormat.format(parsedDate))));
		//LOG.info("*****************************************************");
		}catch(Exception e){
			e.printStackTrace();
		}
		return parsedDate;
	}
	

}
