package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.Area;
import com.apirest.rest.repository.AreaRepository;
import com.apirest.rest.service.AreaaService;
@Service("areaServiceImpl")
public class AreaaServiceImpl implements AreaaService{
	
	@Autowired
	@Qualifier("areaaRepository")
	private AreaRepository areaRepository;

	@Override
	public Area addArea(Area area) {
		return areaRepository.save(area);
	}

	@Override
	public Boolean deleteArea(int id) {
		Area area=areaRepository.getOne(id);
		if(null!=area){
			areaRepository.delete(id);	
			return true;
		}
		else {
			 return false;
		}
	}

	@Override
	public Area findArea(int id) {
		return areaRepository.getOne(id);
	}

	@Override
	public Area updateArea(Area areaU) {
		return areaRepository.saveAndFlush(areaU);
	}

	@Override
	public List<Area> showAreas() {
		Iterable<Area> iAreas= areaRepository.findAll();
		List<Area> lAreas= new ArrayList<Area>();
		iAreas.forEach(lAreas::add);
		return lAreas;
		
	}
	
	

}
