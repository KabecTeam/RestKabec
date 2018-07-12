package com.apirest.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.Anexo;
import com.apirest.rest.serviceImp.AnexoServiceImpl;

@RestController
@CrossOrigin(allowedHeaders="*")
public class AnexoController {
	 
	@Autowired
	@Qualifier("anexoServiceImpl")
	private AnexoServiceImpl anexoServiceImpl;
	
	@RequestMapping(value="/showAnexos", method=RequestMethod.GET)
	public ResponseEntity<Anexo> showAnexos(){
		List<Anexo> lanexos=anexoServiceImpl.getAllAnexos();
		return new ResponseEntity(lanexos,HttpStatus.OK);
	}

}
