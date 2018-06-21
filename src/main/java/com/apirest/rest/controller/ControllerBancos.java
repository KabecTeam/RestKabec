package com.apirest.rest.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import com.apirest.rest.entity.Bancos;
import com.apirest.rest.entity.ContratoNomina;
import com.apirest.rest.entity.EmpresaComplemento;
import com.apirest.rest.service.CatalogoService;


@RestController
public class ControllerBancos {

	@Autowired
	@Qualifier("CatalogoServiceImpl")
	private CatalogoService catalogoService;
	
	@RequestMapping(value="/listBancos",method=RequestMethod.GET)
	public ResponseEntity<Bancos> ListBancos(){
	 List<Bancos> listBancos=catalogoService.listAllBancos();
	return new ResponseEntity(listBancos,HttpStatus.OK);
	}
	
   @RequestMapping(value="/findAllBancos/{id}",method=RequestMethod.GET)
	public ResponseEntity<Bancos> findByIdBancos(@RequestParam(name="idBancos")int id){
		Bancos bancos=catalogoService.findByIdBanco(id);
		return new ResponseEntity(bancos,HttpStatus.OK);
	}
	@RequestMapping(value="/addBancos",method=RequestMethod.POST)
	public ResponseEntity<Bancos> addBancos(@Valid @RequestBody Bancos bancos){
		Bancos bancoadd=catalogoService.addByBanco(bancos);
		return new ResponseEntity(bancoadd,HttpStatus.CREATED);
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
	@RequestMapping(value="/listNomina",method=RequestMethod.GET)
	public ResponseEntity<ContratoNomina> ListContratoNomina(){
		List<ContratoNomina> listNomina=catalogoService.lisAllContNomina();
		return new ResponseEntity(listNomina,HttpStatus.OK);
	}
    @RequestMapping(value="/findNomina",method=RequestMethod.GET)
	public ResponseEntity<ContratoNomina> findByIdContNomina(@RequestParam(name="idConNomina") int id){
	   ContratoNomina contNomina=catalogoService.findByContNomina(id);
		return new ResponseEntity(contNomina,HttpStatus.OK);
	}
	@RequestMapping(value="/addNomina",method=RequestMethod.POST)
	public ResponseEntity<ContratoNomina> addContratoNomina(@Valid @RequestBody ContratoNomina contratoNomina){
	   ContratoNomina addContNomina=catalogoService.addContNomina(contratoNomina);
		return new ResponseEntity(addContNomina,HttpStatus.CREATED);
	}
	@RequestMapping(value="/deleteNomina/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<ContratoNomina> deleteContNomina(@PathVariable("id")int id){
		System.out.println("Eliminar Bancos con:"+id);
		ContratoNomina contNomina=catalogoService.findByContNomina(id);
		if (contNomina==null){
			System.out.println("El id "+id+" del Contrato Nomina no existe:");	
	        return new ResponseEntity<ContratoNomina>(HttpStatus.NOT_FOUND);	
		}
		catalogoService.deleteContNomina(id);
		return new ResponseEntity<ContratoNomina>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/listEmpresaComplemento",method=RequestMethod.GET)
	public ResponseEntity<EmpresaComplemento> ListEmpresaComplemento(){
		List<EmpresaComplemento> empComplemento=catalogoService.listAllEmpresaComplemeto();
		return new ResponseEntity(empComplemento,HttpStatus.OK);
	}
	@RequestMapping(value="/findEmpresaComplemento",method=RequestMethod.GET)
	public ResponseEntity<EmpresaComplemento> findEmpresaComplemento(@RequestParam(name="id")int id){
		EmpresaComplemento empComplemento=catalogoService.findByIdEmpCompl(id);
		return new ResponseEntity(empComplemento,HttpStatus.OK);
	}
	
	public ResponseEntity<EmpresaComplemento> addEmpComplemento(@Valid @RequestBody EmpresaComplemento empCompl){
	    EmpresaComplemento empresaComplemento=catalogoService.addEmpresaComplemento(empCompl);
		return new ResponseEntity(empresaComplemento,HttpStatus.CREATED);
	}
	
	public ResponseEntity<EmpresaComplemento> deleteEmpComplemento(@PathVariable("id")int id){
		EmpresaComplemento empComplemento=catalogoService.findByIdEmpCompl(id);
		if (empComplemento==null){
			System.out.println("No se encontro el id:"+id+" intente de nuevo con otro id");
		return new ResponseEntity<EmpresaComplemento>(HttpStatus.NOT_FOUND);
		}
		catalogoService.deleteEmpreComple(id);
		return new ResponseEntity<EmpresaComplemento>(HttpStatus.NO_CONTENT);
	}
	
	
		/*
	public ResponseEntity<Void> deleteBancos(@Valid @RequestBody Bancos bancos){
		System.out.println("Actualizando nuevo Banco"+bancos.getNombreBanco());
		if(null!=bancosService.findByBancos(bancos)){
			System.out.println("El usuario"+bancos.getNombreBanco()+"ya existe");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		bancosService.addByBanco(bancos);
		HttpHeaders headers=new HttpHeaders(); 
		
		return null;
	}
	
	*/
}
