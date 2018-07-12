package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Anexo;

public interface AnexosService {
	public abstract List<Anexo> getAllAnexos();
	
	public abstract void addanexo(Anexo anexo);
	
	public abstract void deleteAnexo(int idAnexo);
}
