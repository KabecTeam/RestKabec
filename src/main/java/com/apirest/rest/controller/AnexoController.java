package com.apirest.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.apirest.rest.entity.Anexo;
import com.apirest.rest.entity.CalendarioPagos;
import com.apirest.rest.serviceImp.AnexoServiceImpl;

@RestController
@CrossOrigin(allowedHeaders="*")
public class AnexoController {
	 
	@Autowired
	@Qualifier("anexoServiceImpl")
	private AnexoServiceImpl anexoServiceImpl;
	
	Map<String, String> errors;
	
	@RequestMapping(value="/showAnexos", method=RequestMethod.GET)
	public ResponseEntity<Anexo> showAnexos(){
		List<Anexo> lanexos=anexoServiceImpl.getAllAnexos();
		return new ResponseEntity(lanexos,HttpStatus.OK);
	}
	
	@RequestMapping(value="/addAnexo", method=RequestMethod.POST)
	public ResponseEntity<Anexo> addAnexo(@RequestBody Anexo anexo,BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			errors= new HashMap<>();
			for(FieldError error:bindingResult.getFieldErrors()){
				errors.put(error.getField(), error.getDefaultMessage());
				System.out.println("error en el for");
			}
			System.out.println("error response");
			return new ResponseEntity(errors,HttpStatus.NOT_ACCEPTABLE);
			
		}else{
			
			Anexo addanexo= anexoServiceImpl.addanexo(anexo);
			return new ResponseEntity(addanexo,HttpStatus.OK);
		}
	}

}
