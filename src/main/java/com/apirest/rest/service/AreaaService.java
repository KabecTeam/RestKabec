package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Areaa;



public interface AreaaService {
	
	public abstract Areaa addArea(Areaa area);
	
	public Boolean deleteArea(int id);
	
	public abstract Areaa findArea(Integer id);
	
	public abstract Areaa updateArea(Areaa areaU);
	
	public List<Areaa> showAreas();

}
