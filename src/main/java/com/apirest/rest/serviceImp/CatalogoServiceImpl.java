package com.apirest.rest.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.apirest.rest.entity.Bancos;
import com.apirest.rest.entity.ContratoNomina;
import com.apirest.rest.entity.EmpresaComplemento;
import com.apirest.rest.repository.BancosRepository;
import com.apirest.rest.repository.ContratoNominaRepository;
import com.apirest.rest.repository.EmpresaComplementoRepository;
import com.apirest.rest.service.CatalogoService;

@Service("CatalogoServiceImpl")
public class CatalogoServiceImpl implements CatalogoService{

	@Autowired
	@Qualifier("bancosRepository")
	public BancosRepository bancosRepository;
	
	@Autowired
	@Qualifier("contratoNominaRepository")
	public ContratoNominaRepository contratoNominaRepository;
	
	@Autowired
	@Qualifier("empresaComplementoRepository")
	public EmpresaComplementoRepository empresaComplementoRepository;
	
	@Override
	public Bancos findByIdBanco(int id) {
		return bancosRepository.getOne(id);
	}

	@Override
	public List<Bancos> listAllBancos() {
		Iterable<Bancos> bancos=bancosRepository.findAll();
		List<Bancos> banco=new ArrayList<Bancos>();
		bancos.forEach(banco::add);
		return banco;
	}

	@Override
	public Bancos addByBanco(Bancos banco) {
		return bancosRepository.saveAndFlush(banco);
	}

	@Override
	public void deleteBanco(int id) {
		Bancos banco=bancosRepository.getOne(id);
		if(null!=banco){
		bancosRepository.delete(banco);	
		}
	}

	@Override
	public Bancos findByBancos(Bancos bancos) {
		return bancosRepository.getOne(String.valueOf(bancos));
	}

	@Override
	public boolean isBancosExist(Bancos bancos) {
		return bancosRepository.getOne(bancos.getIdBanco())!=null;
	}

	@Override
	public Bancos updateBancos(Bancos bancos) {
		bancosRepository.findById(bancos.getIdBanco());		
		return null;
	}

	@Override
	public ContratoNomina findByContNomina(int id) {
		return contratoNominaRepository.getOne(id);
	}

	@Override
	public List<ContratoNomina> lisAllContNomina() {
		Iterable<ContratoNomina> contNomina=contratoNominaRepository.findAll();
		List<ContratoNomina> listcontNomina=new ArrayList<ContratoNomina>();
		contNomina.forEach(listcontNomina::add);
		return listcontNomina;
	}

	@Override
	public ContratoNomina addContNomina(ContratoNomina contNomina) {
		return contratoNominaRepository.save(contNomina);
	}

	@Override
	public void deleteContNomina(int id) {
		ContratoNomina contNomina=contratoNominaRepository.getOne(id);
		if(null!=contNomina){
			contratoNominaRepository.delete(contNomina);	
		}
		
	}

	@Override
	public ContratoNomina findConNomina(ContratoNomina contNomina) {
		return contratoNominaRepository.getOne(String.valueOf(contNomina));
	}

	@Override
	public boolean isContNominaExist(ContratoNomina contNomina) {
		return contratoNominaRepository.getOne(contNomina.getContratoNomina())!=null;
	}

	@Override
	public ContratoNomina updateContNomina(ContratoNomina contNomina) {

		return null;
	}

	@Override
	public EmpresaComplemento findByIdEmpCompl(int id) {
		return empresaComplementoRepository.getOne(id);
	}

	@Override
	public List<EmpresaComplemento> listAllEmpresaComplemeto() {
		Iterable<EmpresaComplemento> empComplemento=empresaComplementoRepository.findAll();
		List<EmpresaComplemento> ListEmpCompl=new ArrayList<EmpresaComplemento>();
		empComplemento.forEach(ListEmpCompl::add);
		return ListEmpCompl;
	}

	@Override
	public EmpresaComplemento addEmpresaComplemento(EmpresaComplemento empresaComplemento) {
		return empresaComplementoRepository.save(empresaComplemento);
	}

	@Override
	public void deleteEmpreComple(int id) {
		EmpresaComplemento empCompl=empresaComplementoRepository.getOne(id);
		if(null!=empCompl){
			empresaComplementoRepository.delete(empCompl);	
		}
	}

	@Override
	public EmpresaComplemento findEmpreComple(EmpresaComplemento empresaComplemento) {
		return empresaComplementoRepository.getOne(String.valueOf(empresaComplemento));
	}

	@Override
	public boolean isEmpreCompleExist(EmpresaComplemento empresaComplemento) {
		return empresaComplementoRepository.getOne(empresaComplemento.getEmpComplemento())!=null;
	}

	@Override
	public EmpresaComplemento updateEmprComplem(EmpresaComplemento empresaComplemento) {
		// TODO Auto-generated method stub
		return null;
	}

}
