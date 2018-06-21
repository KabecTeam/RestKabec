package com.apirest.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.Cliente;
import com.apirest.rest.serviceImp.ClienteServiceImpl;

@RestController
public class ControllerCliente {
	
	@Autowired
	@Qualifier("clienteServiceImpl")
	private ClienteServiceImpl clienteServiceImpl;
	
	@RequestMapping(value="/ShowClientes", method=RequestMethod.GET )
	public ResponseEntity<Cliente> showClientes(){
		List<Cliente> lClientes= clienteServiceImpl.showClientes();
		return new ResponseEntity(lClientes, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findCliente/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cliente> findCliente(@PathVariable int id){
		Cliente cliente= clienteServiceImpl.findCliente(id);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/addCliente", method=RequestMethod.POST )
	public ResponseEntity<Cliente> addCliente(@Valid @RequestBody Cliente cliente){
		
		Cliente addCliente = clienteServiceImpl.addCliente(cliente);
		return new ResponseEntity<Cliente>(addCliente,HttpStatus.CREATED);
	
	}
	
	@RequestMapping(value="/updateCliente", method=RequestMethod.POST )
	public ResponseEntity<Cliente> updateCliente(@Valid @RequestBody Cliente cliente){
		Cliente clienteUpdate = clienteServiceImpl.updateCliente(cliente);
		return new ResponseEntity<Cliente>(clienteUpdate,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/deleteCliente",method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteCliente(@RequestParam(name="idCliente") int id){
		System.out.println("Eliminar Bancos con:"+id);
		clienteServiceImpl.deleteCliente(id);
		return new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT);
	}
}
