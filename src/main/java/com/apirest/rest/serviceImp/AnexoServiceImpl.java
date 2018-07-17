package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.Anexo;
import com.apirest.rest.repository.AnexoRepository;
import com.apirest.rest.service.AnexosService;

@Service("anexoServiceImpl")
public class AnexoServiceImpl implements AnexosService {
	
	@Autowired
	@Qualifier("anexoRepository")
	private AnexoRepository anexoRepository;

	@Override
	public List<Anexo> getAllAnexos() {
		Iterable<Anexo> allAnexos= anexoRepository.findAll();
		List<Anexo> anexos= new ArrayList<Anexo>();
		allAnexos.forEach(anexos::add);
		return anexos;
		
	}

	@Override
	public Anexo addanexo(Anexo anexo) {
		return anexoRepository.save(anexo);
		
	}

	@Override
	public void deleteAnexo(int idAnexo) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

}
