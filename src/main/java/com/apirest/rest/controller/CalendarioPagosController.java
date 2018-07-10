package com.apirest.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.serviceImp.CalendarioPagosServImpl;

@RestController
@CrossOrigin(allowedHeaders="*")
public class CalendarioPagosController {

	
	@Autowired
	@Qualifier("calendarioPagosServImpl")
	private CalendarioPagosServImpl calendarioPagosServImpl;
	
	
	@RequestMapping(value="/showPagosAnexos", method=RequestMethod.GET){
		
	}
}
