package com.apirest.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.apirest.rest.service.CatalogoService;
import com.apirest.rest.entity.Bancos;
import com.apirest.rest.entity.ConsultorExpediente;
import com.apirest.rest.entity.ContratoNomina;



@CrossOrigin(origins ="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/banco"})
public class BancoController {

	@Autowired
	@Qualifier("CatalogoServiceImpl")
	private CatalogoService catalogoService;
	
	
	@PostMapping
	public Bancos create(@RequestBody Bancos bancos){
		return catalogoService.addByBanco(bancos);
	}
	@GetMapping(path={"/{id}"})
	public Bancos findOne(@PathVariable("id") int id){
		return catalogoService.findByIdBanco(id);
	}
	
	@GetMapping
	public List<Bancos> ListfindAll(){
		return catalogoService.listAllBancos();
	}
	
	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") int id){
		Bancos bancos=catalogoService.findByIdBanco(id);
		if(bancos==null){
			System.out.println("El id "+id+" del Banco no existe:");
		}
		catalogoService.deleteBanco(id);
	}
	
	
	/*
	@RequestMapping(value="/listBancos",method=RequestMethod.GET)
	public ResponseEntity<Bancos> ListBancos(){
	 List<Bancos> listBancos=catalogoService.listAllBancos();
	return new ResponseEntity(listBancos,HttpStatus.OK);
	}
	
   @RequestMapping(value="/findIdBancos/{idBanco}",method=RequestMethod.GET)
	public ResponseEntity<Bancos> findByIdBancos(@PathVariable("idBanco") Integer id){
		Bancos bancos=catalogoService.findByIdBanco(id);
		if(bancos==null){
			System.out.println("El id Banco no existe:");	
			return new ResponseEntity<Bancos>(bancos,HttpStatus.NOT_FOUND);
		}
		catalogoService.findByIdBanco(id);
		return new ResponseEntity(bancos,HttpStatus.NO_CONTENT);
	}
	@RequestMapping(value="/addBancos",method=RequestMethod.POST)
	public ResponseEntity<Bancos> addBancos(@Valid @RequestBody Bancos bancos){
		Bancos bancoadd=catalogoService.addByBanco(bancos);
		System.out.println("Se inserto el banco:"+bancoadd.getNombreBanco());
		return new ResponseEntity(bancoadd,HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/UpdateBancos/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Void> UpdateBancos(@Valid @RequestBody Bancos bancos,@PathVariable("id")int id){
		if(null==catalogoService.findByIdBanco(id)){
			System.out.println("El usuario con id:"+id+" no se encuentra registrado");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		Bancos updateBancos=catalogoService.updateBancos(bancos, id);
		return new ResponseEntity(updateBancos,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/deleteBancos/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Bancos> deleteBancos(@PathVariable("id")int id){
		System.out.println("Eliminar Bancos con:"+id);
		Bancos bancos=catalogoService.findByIdBanco(id);
		if(bancos==null){
			System.out.println("El id "+id+" del Banco no existe:");	
			return new ResponseEntity<Bancos>(HttpStatus.NOT_FOUND);
		}
		catalogoService.deleteBanco(id);
		return new ResponseEntity<Bancos>(HttpStatus.NO_CONTENT);
	}
*/
}
