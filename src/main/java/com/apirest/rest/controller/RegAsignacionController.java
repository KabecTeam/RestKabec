package com.apirest.rest.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.service.RegistroAsignacionService;
import com.apirest.rest.component.HelperReporteEstatusConsultor;
import com.apirest.rest.entity.Personas;
import com.apirest.rest.entity.RegistroAsignacion;
import com.apirest.rest.entity.RegistroContrato;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/reportecontrato"})
public class RegAsignacionController {

	@Autowired
	@Qualifier("registroAsigServiceImpl")
	private RegistroAsignacionService registroAsignacionService;
	private static final Log LOG=LogFactory.getLog(RegistroAsignacionController.class);
	public RegistroContrato registroContratoGlobal=new RegistroContrato();
	public RegistroAsignacion registroAsignacionGlobal=new RegistroAsignacion();
	public HelperReporteEstatusConsultor helperReporteConsultores=new HelperReporteEstatusConsultor();
	
	
	@GetMapping
	public ResponseEntity<HelperReporteEstatusConsultor> ListModel() throws ParseException{
		List<Personas> listaPersona=registroAsignacionService.listPersona();
		List<HelperReporteEstatusConsultor> consultores=new ArrayList<HelperReporteEstatusConsultor>();
		//List<Personas> consult=new ArrayList<Personas>();
		for(Personas lp:listaPersona){
			RegistroAsignacion lr=registroAsignacionService.findAsignacionByPersona(lp);
			RegistroContrato lc=registroAsignacionService.findByContratoPersona(lp);
            Calendar calendar=Calendar.getInstance();
            Calendar calendardate=Calendar.getInstance();
            calendar.add(Calendar.DATE, +45);
            String timeStamp45 = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
            String timeStampHoy=new SimpleDateFormat("yyyyMMdd").format(calendardate.getTime().getTime());
            String timeStampfechAsig = new SimpleDateFormat("yyyyMMdd").format(lr.getFechaFinAsignacion().getTime());
            int time45=Integer.parseInt(timeStamp45);
            int timeHoy=Integer.parseInt(timeStampHoy);
            int timefechAsig=Integer.parseInt(timeStampfechAsig);
            LOG.info("Date now time24:"+time45);
			LOG.info("Date now timeHoy:"+timeHoy);
 			LOG.info("Date now timefechAsig:"+timefechAsig);
			
 			if(timeHoy>=timefechAsig){
 				helperReporteConsultores.setEstatus("Contrato vencido");
 				LOG.info("Prime dato es:"+helperReporteConsultores.getEstatus());
			}else{				
			if(time45>=timefechAsig && timefechAsig<=time45){
				helperReporteConsultores.setEstatus("Contrato por vencer");
				LOG.info("Prime dato es:"+helperReporteConsultores.getEstatus());
			}else{
				helperReporteConsultores.setEstatus("Contrato vigente");
				LOG.info("Prime dato es:"+helperReporteConsultores.getEstatus());
			}
				
			}	
			
			LOG.info("El Dato Nombre Area es:"+lr.getArea().getNombreArea());
			LOG.info("El Dato Nombre Lider es:"+lr.getLider().getNombre());
			LOG.info("El resultado es:"+lp.getIdpersona());
			LOG.info("El Dato Consultor es:"+lc.getEstConsultor());
		    LOG.info("El resultado área es:"+lr.getArea().getNombreArea());
		    LOG.info("El resultado área es:"+lr.getAnexo().getAnexooc());
            			
		    
		consultores.add(new HelperReporteEstatusConsultor(lp.getNombre(),lp.getApellidoPaterno(),lp.getApellidoMaterno()
				,lr.getArea().getNombreArea(),lr.getLider().getNombre()+" "+lr.getLider().getApellidoPaterno()
				+" "+lr.getLider().getApellidoMaterno(),lr.getAnexo().getAnexooc(),lc.getNumConsultor(),lc.getContratoNomina().getTipoConNom(),lc.getFechininomin(),
				lc.getFechfinnomin(),lc.getEmpresaComplemento().getTipoComplemento(),lc.getFechinicomp(),helperReporteConsultores.getEstatus()));
		}
		return new ResponseEntity(consultores,HttpStatus.OK);
	}

	@RequestMapping(value="/listRegContrato",method=RequestMethod.GET)
	public ResponseEntity<RegistroContrato> listRegContrato(){
		List<RegistroContrato> listContrato=registroAsignacionService.listRegistroContrato();
		return new ResponseEntity(listContrato,HttpStatus.OK);
	}
	
	
}
