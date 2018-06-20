package com.apirest.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.EmpresaComplemento;

@Repository("empresaComplementoRepository")
public interface EmpresaComplementoRepository extends JpaRepository<EmpresaComplemento, Serializable>{

}
