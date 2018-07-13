package com.apirest.rest.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.Area;
import com.apirest.rest.entity.CalendarioPagos;
import com.apirest.rest.serviceImp.CalendarioPagosServImpl;


@RestController
@CrossOrigin(allowedHeaders="*")
public class CalendarioPagosController {

	Map<String, String> errors;
	
	@Autowired
	@Qualifier("calendarioPagosServImpl")
	private CalendarioPagosServImpl calendarioPagosServImpl;
	
	

	@RequestMapping(value="/showPagosAnexos", method=RequestMethod.GET)
	public ResponseEntity<CalendarioPagos> muestraPagos(){
		List<CalendarioPagos> desordenPagos= calendarioPagosServImpl.pagos();
		List<CalendarioPagos> ordenIdAnexo= new ArrayList<CalendarioPagos>();
		List<CalendarioPagos> ordenIdConsultor= new ArrayList<CalendarioPagos>();
		List<CalendarioPagos> ordenIdConsultorPago= new ArrayList<CalendarioPagos>();
		//primero ordena todos los pagos de tabla de pagos  
		//ordena por id de Anexo
		Collections.sort(desordenPagos,new Comparator<CalendarioPagos>(){
			
			@Override
			public int compare(CalendarioPagos p1, CalendarioPagos p2) {
				return new Integer(p1.getAnexo().getIdanexo()).compareTo(new Integer(p2.getAnexo().getIdanexo()));
			}
		});
		
		Iterator<CalendarioPagos> preOrdenIdAnexo = desordenPagos.iterator();
		preOrdenIdAnexo.forEachRemaining(ordenIdAnexo::add);

		//Ordena por id del Consultor
		Collections.sort(ordenIdAnexo,new Comparator<CalendarioPagos>(){
			
			@Override
			public int compare(CalendarioPagos p1, CalendarioPagos p2) {
				return new Integer(p1.getPersona().getIdpersona()).compareTo(new Integer(p2.getPersona().getIdpersona()));
			}
		});
		
		Iterator<CalendarioPagos> preOrdenIdConsultor = ordenIdAnexo.iterator();
		preOrdenIdConsultor.forEachRemaining(ordenIdConsultor::add);
		
		//Ordena por id de pagos para saber todos los pagos de cada consultor por orden
		
		Collections.sort(ordenIdConsultor,new Comparator<CalendarioPagos>(){
			
			@Override
			public int compare(CalendarioPagos p1, CalendarioPagos p2) {
				return new Integer(p1.getPersona().getIdpersona()).compareTo(new Integer(p2.getPersona().getIdpersona()));
			}
		});
		
		Iterator<CalendarioPagos> preOrdenIdConsultorPagos = ordenIdConsultor.iterator();
		preOrdenIdConsultorPagos.forEachRemaining(ordenIdConsultorPago::add);
		
		return new ResponseEntity(ordenIdConsultorPago,HttpStatus.OK);
		
		
		
		
	}
	
	
	@RequestMapping(value="/addPagoAnexo", method=RequestMethod.POST )
	public ResponseEntity<CalendarioPagos> addArea(@Valid @RequestBody CalendarioPagos calendarioPagosRecibidos,BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			errors= new HashMap<>();
			for(FieldError error:bindingResult.getFieldErrors()){
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity(errors,HttpStatus.NOT_ACCEPTABLE);
		}else{
			
			List<CalendarioPagos> pagos= calendarioPagosServImpl.pagos();
			List<CalendarioPagos> pagosAnexo= new ArrayList<CalendarioPagos>();
			
			for(CalendarioPagos pagoAnexo :pagos){
				if(pagoAnexo.getAnexo().getIdanexo()== calendarioPagosRecibidos.getAnexo().getIdanexo())
				{
					if(pagoAnexo.getPersona().getIdpersona()==calendarioPagosRecibidos.getPersona().getIdpersona()){
						pagosAnexo.add(pagoAnexo);
					}
					
				}
				
			}
			
			Area addArea = areaServiceImpl.addArea(area);
			return new ResponseEntity(addArea,HttpStatus.OK);
		}
	}

}
