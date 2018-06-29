package com.apirest.rest.entity;

import javax.persistence.EntityManager;

import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdResolver;

public class Manager implements ObjectIdResolver {
	private EntityManager entityManager;
	
	public Manager(final EntityManager entityManager) {

        this.setEntityManager(entityManager);

    }

	@Override
	public void bindItem(IdKey arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canUseFor(ObjectIdResolver arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ObjectIdResolver newForDeserialization(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object resolveId(IdKey arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
