package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Area;



public interface AreaaService {
	
	public abstract Area addArea(Area area);
	
	public Boolean deleteArea(int id);
	
	public abstract Area findArea(int id);
	
	public abstract Area updateArea(Area areaU);
	
	public List<Area> showAreas();

}
