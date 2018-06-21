package com.apirest.rest.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.rest.entity.Areaa;

@Repository("areaaRepository")
public interface AreaRepository extends JpaRepository<Areaa, Serializable> {

}
