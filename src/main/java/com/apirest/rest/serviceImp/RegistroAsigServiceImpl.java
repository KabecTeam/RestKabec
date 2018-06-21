package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.repository.RegistroAsignacionRepository;
import com.apirest.rest.service.RegistroAsignacionService;

@Service("registroAsigServiceImpl")
public class RegistroAsigServiceImpl implements RegistroAsignacionService{

	@Autowired
	@Qualifier("registroAsignacionRepository")
	private RegistroAsignacionRepository registroAsignacionRepository;
	
	@Override
	public List<RegistroAsignacion> listRegistroAsignacion() {
	Iterable<RegistroAsignacion> registroAsignacion=registroAsignacionRepository.findAll();
	List<RegistroAsignacion> listAsignacion=new ArrayList<RegistroAsignacion>();
	registroAsignacion.forEach(listAsignacion::add);
	return listAsignacion;
	}

	@Override
	public RegistroAsignacion findIdregistroAsignacion(int id) {
		return registroAsignacionRepository.getOne(id);
	}

	@Override
	public RegistroAsignacion findRegistroAsignacion(RegistroAsignacion registroAsignacion) {
		return registroAsignacionRepository.getOne(String.valueOf(registroAsignacion));
	}
}
