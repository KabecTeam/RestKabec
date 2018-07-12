package com.apirest.rest.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.CalendarioPagos;
import com.apirest.rest.serviceImp.CalendarioPagosServImpl;


@RestController
@CrossOrigin(allowedHeaders="*")
public class CalendarioPagosController implements Comparable<CalendarioPagos>{

	
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



	@Override
	public int compareTo(CalendarioPagos o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
