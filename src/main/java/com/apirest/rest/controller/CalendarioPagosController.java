package com.apirest.rest.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.rest.entity.CalendarioPagos;
import com.apirest.rest.serviceImp.CalendarioPagosServImpl;


@RestController
@CrossOrigin(allowedHeaders="*")
public class CalendarioPagosController {

	Map<String, String> errors;
	
	@Autowired
	@Qualifier("calendarioPagosServImpl")
	private CalendarioPagosServImpl calendarioPagosServImpl;
	
	List<CalendarioPagos> ordenIdConsultor= new ArrayList<CalendarioPagos>();

	@RequestMapping(value="/showPagosAnexos", method=RequestMethod.GET)
	public ResponseEntity<CalendarioPagos> muestraPagos(){
		List<CalendarioPagos> desordenPagos= calendarioPagosServImpl.pagos();
		List<CalendarioPagos> ordenIdAnexo= new ArrayList<CalendarioPagos>();
		List<CalendarioPagos> ordenIdConsultor= new ArrayList<CalendarioPagos>();
		List<CalendarioPagos> ordenIdConsultorPago= new ArrayList<CalendarioPagos>();
		//primero ordena todos los pagos de tabla de pagos  
		//ordena por id de Anexo
		Collections.sort(desordenPagos,new Comparator<CalendarioPagos>(){
			
			@Override
			public int compare(CalendarioPagos p1, CalendarioPagos p2) {
				return new Integer(p1.getAnexo().getIdanexo()).compareTo(new Integer(p2.getAnexo().getIdanexo()));
			}
		});
		
		Iterator<CalendarioPagos> preOrdenIdAnexo = desordenPagos.iterator();
		preOrdenIdAnexo.forEachRemaining(ordenIdAnexo::add);

		//Ordena por id del Consultor
		Collections.sort(ordenIdAnexo,new Comparator<CalendarioPagos>(){
			
			@Override
			public int compare(CalendarioPagos p1, CalendarioPagos p2) {
				return new Integer(p1.getPersona().getIdpersona()).compareTo(new Integer(p2.getPersona().getIdpersona()));
			}
		});
		
		Iterator<CalendarioPagos> preOrdenIdConsultor = ordenIdAnexo.iterator();
		preOrdenIdConsultor.forEachRemaining(ordenIdConsultor::add);
		
		//Ordena por id de pagos para saber todos los pagos de cada consultor por orden
		
		Collections.sort(ordenIdConsultor,new Comparator<CalendarioPagos>(){
			
			@Override
			public int compare(CalendarioPagos p1, CalendarioPagos p2) {
				return new Integer(p1.getPersona().getIdpersona()).compareTo(new Integer(p2.getPersona().getIdpersona()));
			}
		});
		
		Iterator<CalendarioPagos> preOrdenIdConsultorPagos = ordenIdConsultor.iterator();
		preOrdenIdConsultorPagos.forEachRemaining(ordenIdConsultorPago::add);
		
		int pago= ordenIdConsultorPago.size();
		System.out.println(pago);
		return new ResponseEntity(ordenIdConsultorPago,HttpStatus.OK);
		
		
		
		
	}
	
	
	@RequestMapping(value="/addPagoAnexo", method=RequestMethod.POST )
	public ResponseEntity<CalendarioPagos> creaPago( @RequestBody CalendarioPagos calendarioPagosRecibidos,BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			errors= new HashMap<>();
			for(FieldError error:bindingResult.getFieldErrors()){
				errors.put(error.getField(), error.getDefaultMessage());
				System.out.println("error en el for");
			}
			System.out.println("error response");
			return new ResponseEntity(errors,HttpStatus.NOT_ACCEPTABLE);
			
		}else{
			
			List<CalendarioPagos> pagos= calendarioPagosServImpl.pagos();
			List<CalendarioPagos> pagosAnexo= new ArrayList<CalendarioPagos>();
			List<CalendarioPagos> ordenIdPago= new ArrayList<CalendarioPagos>();
			for(CalendarioPagos pagoAnexo:pagos){
				if(pagoAnexo.getAnexo().getIdanexo()== calendarioPagosRecibidos.getAnexo().getIdanexo())
				{
					System.out.println("entro");
					System.out.println(calendarioPagosRecibidos);
					System.out.println("idanexorecibido:"+calendarioPagosRecibidos.getAnexo().getIdanexo());
					System.out.println("idanexo:"+pagoAnexo.getAnexo().getIdanexo());
					System.out.println("idpersonarecibido:"+calendarioPagosRecibidos.getPersona().getIdpersona());
					if(pagoAnexo.getPersona().getIdpersona()==calendarioPagosRecibidos.getPersona().getIdpersona()){
						pagosAnexo.add(pagoAnexo);
						System.out.println("idpersonarecibido:"+calendarioPagosRecibidos.getPersona().getIdpersona());
						System.out.println("idpersona:"+pagoAnexo.getPersona().getIdpersona());
						System.out.println("pagos Coinciden"+pagosAnexo.size());
					}
					
				}
				
			}
			
		
			Collections.sort(pagosAnexo,new Comparator<CalendarioPagos>(){
			
				@Override
				public int compare(CalendarioPagos p1, CalendarioPagos p2) {
					return new Integer(p1.getIdpago()).compareTo(new Integer(p2.getIdpago()));
				}
			});
			
			Iterator<CalendarioPagos> preOrdenIdPagos = pagosAnexo.iterator();
			preOrdenIdPagos.forEachRemaining(ordenIdPago::add);
			
			int numeroUltimoPago= ordenIdPago.size();
			System.out.println("size ultimo Pago"+ numeroUltimoPago);
			CalendarioPagos ultimoPago= ordenIdPago.get(numeroUltimoPago-1);
			System.out.println("id ultimo pago"+ ultimoPago.getIdpago());
			CalendarioPagos pagoACalendrioPagos = calendarioPagosRecibidos;
			int montoPago=calendarioPagosRecibidos.getMontopago();
			int importe=ultimoPago.getImporte();
			
			pagoACalendrioPagos.setDeuda(ultimoPago.getDeuda());
			pagoACalendrioPagos.setFechafacturacion(calendarioPagosRecibidos.getFechafacturacion());
			pagoACalendrioPagos.setFechainiciofactura(ultimoPago.getFechainiciofactura());
			pagoACalendrioPagos.setFechainiciopago(calendarioPagosRecibidos.getFechainiciopago());
			pagoACalendrioPagos.setFechapago(calendarioPagosRecibidos.getFechapago());
			pagoACalendrioPagos.setImporte(ultimoPago.getImporte());
			pagoACalendrioPagos.setMontopago(calendarioPagosRecibidos.getMontopago());
			
			if(montoPago>importe){
				int calPagosFaltantes=montoPago/importe;
				int numeroPagos=ultimoPago.getNumeropago();
				pagoACalendrioPagos.setPagosfaltantes(numeroPagos-calPagosFaltantes);
			}else{
				pagoACalendrioPagos.setPagosfaltantes(ultimoPago.getPagosfaltantes()-1);
			}
			pagoACalendrioPagos.setNumeropago(ultimoPago.getNumeropago()+1);
			
			pagoACalendrioPagos.setSaldo(ultimoPago.getSaldo()-calendarioPagosRecibidos.getMontopago());
			pagoACalendrioPagos.setAnexo(calendarioPagosRecibidos.getAnexo());
			pagoACalendrioPagos.setFacturas(calendarioPagosRecibidos.getFacturas());
			pagoACalendrioPagos.setPeriodo(ultimoPago.getPeriodo());
			pagoACalendrioPagos.setPersona(calendarioPagosRecibidos.getPersona());
			
			
			
			
			
			CalendarioPagos addCalendarioPagos= calendarioPagosServImpl.registroPagoAnexo(pagoACalendrioPagos);
			return new ResponseEntity(addCalendarioPagos,HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/PagoAnexo", method=RequestMethod.POST )
	public ResponseEntity<CalendarioPagos> crearPago( @RequestBody CalendarioPagos calendarioPagosRecibidos,BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			errors= new HashMap<>();
			for(FieldError error:bindingResult.getFieldErrors()){
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity(errors,HttpStatus.NOT_ACCEPTABLE);
		}else{
			
			CalendarioPagos addCalendarioPagos= calendarioPagosServImpl.registroPagoAnexo(calendarioPagosRecibidos);
			return new ResponseEntity(addCalendarioPagos,HttpStatus.OK);
		}
	}

}
