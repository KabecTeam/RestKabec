package com.apirest.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.RegistroAsignacion;

@Repository("registroAsignacion")
public interface RegistroAsignacionRepository extends JpaRepository<RegistroAsignacion, Serializable> {

}
