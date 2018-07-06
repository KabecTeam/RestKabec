package com.apirest.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.Area;
import com.apirest.rest.entity.Cliente;
import com.apirest.rest.serviceImp.AreaaServiceImpl;
import com.apirest.rest.serviceImp.ClienteServiceImpl;

@RestController
//@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class AreaController {
	
	@Autowired
	@Qualifier("areaServiceImpl")
	private AreaaServiceImpl areaServiceImpl;
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteServiceImpl clienteServiceImpl;

	@RequestMapping(value="/addArea", method=RequestMethod.POST )
	public ResponseEntity<Area> addArea(@Valid @RequestBody Area area){
		
		Cliente id=area.getCliente();
		int idClie=id.getIdCliente();
		System.out.println("Id es:"+idClie);
		Cliente cliente= clienteServiceImpl.findCliente(idClie);
		
		if(null!=cliente){
			Area addArea = areaServiceImpl.addArea(area);
			return new ResponseEntity<Area>(addArea,HttpStatus.CREATED);
			
		}else {
			
			return new ResponseEntity<Area>(HttpStatus.CONFLICT);
		}
		
	}
	
	@RequestMapping(value="/delArea", method=RequestMethod.DELETE )
	public ResponseEntity<Boolean> delArea(@RequestParam(name="idArea")  int id){
		Boolean respuesta=areaServiceImpl.deleteArea(id);
		return new ResponseEntity<Boolean>(respuesta,HttpStatus.OK);
		
	
	}
	
	@RequestMapping(value="/updateArea", method=RequestMethod.POST )
	public ResponseEntity<Area> delArea(@Valid @RequestBody Area area){
		Area areaUPT=areaServiceImpl.updateArea(area);
		return new ResponseEntity<Area>(areaUPT,HttpStatus.OK);
		
	
	}
	
	@RequestMapping(value="/findArea", method=RequestMethod.GET)
	public ResponseEntity<Area> findCliente(@RequestParam(name="idArea") Integer id){
		Area area= areaServiceImpl.findArea(id);
		System.out.println(id);
		return new ResponseEntity(area,HttpStatus.FOUND);
		
	}
	
	@RequestMapping(value="/ShowAreas", method=RequestMethod.GET )
	public ResponseEntity<Area> showAreas(){
		List<Area> areas=  areaServiceImpl.showAreas();
		return new ResponseEntity(areas, HttpStatus.OK);
	}
}
