package com.apirest.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.Bancos;

@Repository("bancosRepository")
public interface BancosRepository extends JpaRepository<Bancos, Serializable>{

}
