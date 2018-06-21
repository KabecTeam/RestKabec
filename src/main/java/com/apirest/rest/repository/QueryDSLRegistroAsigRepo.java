package com.apirest.rest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.QRegistroAsignacion;
import com.apirest.rest.entity.RegistroAsignacion;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLRegistroAsigRepo")
public class QueryDSLRegistroAsigRepo {

	private QRegistroAsignacion qRegistro=QRegistroAsignacion.registroAsignacion;
	
	@PersistenceContext
	private EntityManager em;
	
	public RegistroAsignacion find(){
		JPAQuery<RegistroAsignacion> query=new JPAQuery<RegistroAsignacion>(em);
		
	RegistroAsignacion	registro1=(RegistroAsignacion) query.select(qRegistro.Anexo,qRegistro.fechaFinAnexoAsignacion).from(qRegistro).where(qRegistro.ubicacionConsultor.eq("Interno")).fetchOne();

	//List<RegistroAsignacion> registro2=query.select(qRegistro).from(qRegistro).where(qRegistro.persona.between(10, 50));
	return registro1;
	}
}
