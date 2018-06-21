package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.Cliente;
import com.apirest.rest.repository.ClienteRepository;
import com.apirest.rest.service.ClienteService;

@Service("clienteServiceImpl")
public class ClienteServiceImpl implements  ClienteService {

	
	@Autowired
	@Qualifier("clienteRepository")
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> showClientes() {
		Iterable<Cliente> iClientes= clienteRepository.findAll();
		List<Cliente> lCliente= new ArrayList<Cliente>();
		iClientes.forEach(lCliente::add);
		return lCliente;
	}


	@Override
	public Cliente addCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Boolean deleteCliente(int id) {
		Cliente cliente=clienteRepository.getOne(id);
		if(null!=cliente){
			clienteRepository.deleteById(id);	
			return true;
		}
		else {
			 return false;
		}
	}

	@Override
	public Cliente findCliente(int id) {
		return clienteRepository.getOne(id);
		
	}

	@Override
	public Cliente updateCliente(Cliente clienteU ) {
		return clienteRepository.saveAndFlush(clienteU);
		
		
	}
	

}
