package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Cliente;

public interface ClienteService {
	
	//Servico Cliente
	public abstract Cliente addCliente(Cliente cliente);
	
	public Boolean deleteCliente(int id);
	
	public abstract Cliente findCliente(int id);
	
	public abstract Cliente updateCliente(Cliente clienteU);
	
	public List<Cliente> showClientes();

}
