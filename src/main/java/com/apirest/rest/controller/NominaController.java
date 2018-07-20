package com.apirest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.service.CatalogoService;
import com.apirest.rest.entity.ContratoNomina;

@CrossOrigin(origins ="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/nomina"})
public class NominaController {

	@Autowired
	@Qualifier("CatalogoServiceImpl")
	private CatalogoService catalogoService;
	
	@PostMapping
	public ContratoNomina createNomina(@RequestBody ContratoNomina contratoNomina){
		return catalogoService.addContNomina(contratoNomina);
	}
	
	@GetMapping(path={"{/id}"})
	public ContratoNomina findOneNomina(@PathVariable("id")int id){
		return catalogoService.findByContNomina(id);
	}
	
	@GetMapping
	public List<ContratoNomina> ListfindAllNomina(){
		return catalogoService.lisAllContNomina();
	}
	
	@DeleteMapping(path ={"/{id}"})
	public void deleteNomina(@PathVariable("id")int id){
		ContratoNomina contratoNomina=catalogoService.findByContNomina(id);
		if(contratoNomina==null){
			System.out.println("El id "+id+" del Contrato Nomina no existe:");
		}
		catalogoService.deleteContNomina(id);
	}
	
}
