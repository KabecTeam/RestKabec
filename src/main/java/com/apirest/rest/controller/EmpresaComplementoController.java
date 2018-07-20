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
import com.apirest.rest.entity.EmpresaComplemento;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/complemento")
public class EmpresaComplementoController {

	@Autowired
	@Qualifier("CatalogoServiceImpl")
	private CatalogoService catalogoService;
	
	
	@PostMapping
	public EmpresaComplemento createComplemento(@RequestBody EmpresaComplemento empresaComplemento){
		return catalogoService.addEmpresaComplemento(empresaComplemento);
	}
	
	@GetMapping
	public List<EmpresaComplemento> listAllComplemento(){
	return catalogoService.listAllEmpresaComplemeto();	
	}
	
	@GetMapping(path={"/{id}"})
	public EmpresaComplemento findComplemento(@PathVariable("id")int id){
		return catalogoService.findByIdEmpCompl(id);
	}
	
	@DeleteMapping(path ={"/{id}"})
	public void deleteComplemento(@PathVariable("id")int id){
		EmpresaComplemento empresaComplemento=catalogoService.findByIdEmpCompl(id);
		if(empresaComplemento==null){
			System.out.println("El id:"+id+" no existe en la bd");
		}
		catalogoService.deleteContNomina(id);
	}
	
}
