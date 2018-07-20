package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.service.RegistroAsignacionService;
import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.entity.RegistroContrato;
import com.apirest.rest.repository.PersonasRepository;
import com.apirest.rest.repository.RegistroAsignacionRepository;
import com.apirest.rest.repository.RegistroContratoReposioty;


@Service("registroAsigServiceImpl")
public class RegistroAsignacionServiceImpl implements RegistroAsignacionService{

	@Autowired
	@Qualifier("registroAsignacionRepository")
	private RegistroAsignacionRepository registroAsignacionRepository;
	
	@Autowired
	@Qualifier("registroContratoReposioty")
	private RegistroContratoReposioty registroContratoReposioty;
	
	@Autowired
	@Qualifier("personasRepository")
	private PersonasRepository personasRepository;

	@Override
	public List<RegistroAsignacion> listRegistroAsignacion() {
	Iterable<RegistroAsignacion> registroAsignacion=registroAsignacionRepository.findAll();
	List<RegistroAsignacion> listAsignacion=new ArrayList<RegistroAsignacion>();
	registroAsignacion.forEach(listAsignacion::add);
	return listAsignacion;
	}
	
	@Override
	public RegistroAsignacion findIdregistroAsignacion(Integer id) {
		return registroAsignacionRepository.getOne(id);
	}

	@Override
	public RegistroAsignacion findRegistroAsignacion(RegistroAsignacion registroAsignacion) {
		return registroAsignacionRepository.getOne(String.valueOf(registroAsignacion));
	}

	@Override
	public RegistroAsignacion findAsignacionByPersona(Personas personas) {
		return registroAsignacionRepository.getRegistroAsignacionBypersona(personas);
	}

	@Override
	public RegistroContrato findIdRegistroContrato(Integer id) {
		return registroContratoReposioty.getOne(id);
	}

	@Override
	public RegistroContrato findByContratoPersona(Personas persona) {
		return registroContratoReposioty.getRegistroContratoBypersonas(persona);
	}

	@Override
	public Personas findByPersona(Personas personas) {
		return personasRepository.idpersona(personas);
	}

	@Override
	public Personas findByIdPersona(Integer id) {
		return personasRepository.getOne(id);
	}

	@Override
	public List<Personas> listPersona() {
		List<Personas> persona=personasRepository.findAll();
		List<Personas> listpersona=new ArrayList<Personas>();
		persona.forEach(listpersona::add);
		return listpersona;
	}

	@Override
	public List<RegistroContrato> listRegistroContrato() {
	List<RegistroContrato> registro=registroContratoReposioty.findAll();
	List<RegistroContrato> listRegistro=new ArrayList<RegistroContrato>();
	registro.forEach(listRegistro::add);
		return listRegistro;
	}
}	
