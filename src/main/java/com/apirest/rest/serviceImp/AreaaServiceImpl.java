package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.Areaa;
import com.apirest.rest.repository.AreaRepository;
import com.apirest.rest.service.AreaaService;
@Service("areaServiceImpl")
public class AreaaServiceImpl implements AreaaService{
	
	@Autowired
	@Qualifier("areaaRepository")
	private AreaRepository areaRepository;

	@Override
	public Areaa addArea(Areaa area) {
		return areaRepository.save(area);
	}

	@Override
	public Boolean deleteArea(int id) {
		Areaa area=areaRepository.getOne(id);
		if(null!=area){
			areaRepository.deleteById(id);	
			return true;
		}
		else {
			 return false;
		}
	}

	@Override
	public Areaa findArea(Integer id) {
		return areaRepository.getOne(id);
	}

	@Override
	public Areaa updateArea(Areaa areaU) {
		return areaRepository.saveAndFlush(areaU);
	}

	@Override
	public List<Areaa> showAreas() {
		Iterable<Areaa> iAreas= areaRepository.findAll();
		List<Areaa> lAreas= new ArrayList<Areaa>();
		iAreas.forEach(lAreas::add);
		return lAreas;
		
	}
	
	

}
