package com.apirest.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.EmpresaComplemento;


@Repository("empresaComplementoRepository")
public interface EmpresaComplementoRepository extends CrudRepository<EmpresaComplemento, Integer>{
	
	public abstract EmpresaComplemento findByEmpComplemento(Integer id);

}
