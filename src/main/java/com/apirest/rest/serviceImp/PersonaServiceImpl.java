package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.apirest.rest.entity.Personas;
import com.apirest.rest.repository.PersonaRepository;
import com.apirest.rest.service.PersonaService;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService{

	
	@Autowired
	@Qualifier("personaRepository")
	private PersonaRepository personaRepository;
	
	@Override
	public List<Personas> findPerson() {
		Iterable<Personas> iPersonaRepository= personaRepository.findAll();
		List<Personas> lPersonaRepository= new ArrayList<Personas>();
		iPersonaRepository.forEach(lPersonaRepository::add);
		return lPersonaRepository;
	}
	
	

}
