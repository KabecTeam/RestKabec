package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.Anexo;
import com.apirest.rest.entity.CalendarioPagos;
import com.apirest.rest.repository.CalendarioPagosRepository;
import com.apirest.rest.service.CalendarioPagosService;

@Service("calendarioPagosServImpl")
public class CalendarioPagosServImpl implements CalendarioPagosService{

	@Autowired
	@Qualifier("calendarioPagosRepository")
	public CalendarioPagosRepository calendarioPagosRepository;
	
	@Override
	public List<CalendarioPagos> pagos() {
		Iterable<CalendarioPagos> pagos= calendarioPagosRepository.findAll();
		List<CalendarioPagos> todosLosPagos= new ArrayList<CalendarioPagos>();
		for(CalendarioPagos pago:todosLosPagos){
				Anexo anexo =pago.getAnexo();
				int idAnexo= anexo.getIdanexo();
				Optional<CalendarioPagos> preOrderIdAnexo= calendarioPagosRepository.findById(idAnexo);
				List<CalendarioPagos> orderIdAnexo= new ArrayList<CalendarioPagos>();

				
			
		}
		pagos.forEach(todosLosPagos::add);
		return todosLosPagos;
	}

	@Override
	public CalendarioPagos registroPagoAnexo(CalendarioPagos calendarioPagos) {
		return calendarioPagosRepository.save(calendarioPagos);
	}
	
	

}
