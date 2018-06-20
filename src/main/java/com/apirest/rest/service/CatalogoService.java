package com.apirest.rest.service;

import java.util.List;

import com.apirest.rest.entity.Bancos;
import com.apirest.rest.entity.ContratoNomina;
import com.apirest.rest.entity.EmpresaComplemento;

public interface CatalogoService {

	public abstract Bancos findByIdBanco(int id);
	
	public abstract List<Bancos> listAllBancos();
	
	public abstract Bancos addByBanco(Bancos banco);
	
	public void deleteBanco(int id);
	
	public abstract Bancos findByBancos(Bancos bancos);
	
	public boolean isBancosExist(Bancos bancos);
	
	public abstract Bancos updateBancos(Bancos bancos); 
	
	public abstract ContratoNomina findByContNomina(int id);
	
	public abstract List<ContratoNomina> lisAllContNomina();
	
	public abstract ContratoNomina addContNomina(ContratoNomina contNomina);
	
	public void deleteContNomina(int id);
	
	public abstract ContratoNomina findConNomina(ContratoNomina contNomina);
	
	public boolean isContNominaExist(ContratoNomina contNomina);
	
	public abstract ContratoNomina updateContNomina(ContratoNomina contNomina);

	public abstract EmpresaComplemento findByIdEmpCompl(int id);

	public abstract List<EmpresaComplemento> listAllEmpresaComplemeto();
	
	public abstract EmpresaComplemento addEmpresaComplemento(EmpresaComplemento empresaComplemento);
	
	public void deleteEmpreComple(int id);
	
	public abstract EmpresaComplemento findEmpreComple(EmpresaComplemento empresaComplemento);
	
	public boolean isEmpreCompleExist(EmpresaComplemento empresaComplemento);
	
	public abstract EmpresaComplemento updateEmprComplem(EmpresaComplemento empresaComplemento);
	
}
