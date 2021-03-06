package com.apirest.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.Areaa;
import com.apirest.rest.entity.Cliente;
import com.apirest.rest.serviceImp.AreaaServiceImpl;
import com.apirest.rest.serviceImp.ClienteServiceImpl;

@RestController
public class AreaController {
	
	@Autowired
	@Qualifier("areaServiceImpl")
	private AreaaServiceImpl areaServiceImpl;
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteServiceImpl clienteServiceImpl;

	@RequestMapping(value="/addArea", method=RequestMethod.POST )
	public ResponseEntity<Areaa> addArea(@Valid @RequestBody Areaa area){
		Integer id=area.getIdCliente();
		System.out.println("Id es:"+id);
		Cliente cliente= clienteServiceImpl.findCliente(id);
		
		if(null!=cliente){
			Areaa addArea = areaServiceImpl.addArea(area);
			return new ResponseEntity<Areaa>(addArea,HttpStatus.CREATED);
			
		}else {
			
			return new ResponseEntity<Areaa>(HttpStatus.CONFLICT);
		}
		
	}
	
	@RequestMapping(value="/delArea", method=RequestMethod.DELETE )
	public ResponseEntity<Boolean> delArea(@RequestParam(name="idArea")  int id){
		Boolean respuesta=areaServiceImpl.deleteArea(id);
		return new ResponseEntity<Boolean>(respuesta,HttpStatus.OK);
		
	
	}
	
	@RequestMapping(value="/updateArea", method=RequestMethod.POST )
	public ResponseEntity<Areaa> delArea(@Valid @RequestBody Areaa area){
		Areaa areaUPT=areaServiceImpl.updateArea(area);
		return new ResponseEntity<Areaa>(areaUPT,HttpStatus.OK);
		
	
	}
	
	@RequestMapping(value="/findArea", method=RequestMethod.GET)
	public ResponseEntity<Areaa> findCliente(@RequestParam(name="idArea") int id){
		Areaa area= areaServiceImpl.findArea(id);
		return new ResponseEntity<Areaa>(area, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/ShowAreas", method=RequestMethod.GET )
	public ResponseEntity<Areaa> showAreas(){
		List<Areaa> lAreas= areaServiceImpl.showAreas();
		return new ResponseEntity(lAreas, HttpStatus.OK);
	}
}
