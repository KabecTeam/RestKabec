package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.repository.RegistroAsignacionRepository;
import com.apirest.rest.service.AsignadosService;

@Service("asignacionServiceImpl")
public class AsignacionServiceImpl implements AsignadosService{

	
	@Autowired
	@Qualifier("registroAsignacion")
	private RegistroAsignacionRepository registroAsignacionRepository; 
	
	@Override
	public List<RegistroAsignacion> ShowAsig() {
		Iterable<RegistroAsignacion> iRegistroAsignacion= registroAsignacionRepository.findAll();
		List<RegistroAsignacion> lRegistroAsignacion= new ArrayList<RegistroAsignacion>();
		iRegistroAsignacion.forEach(lRegistroAsignacion::add);
		return lRegistroAsignacion;
	}
	
	

}
