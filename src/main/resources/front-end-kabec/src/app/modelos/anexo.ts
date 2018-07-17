export class Anexo {

	idanexo: any;
	anexooc: any;
	clavepresupuestal: any;
	condicionespago: any;
	descripcion: any;
	fechaFin: any;
	fechaInicio: any;
	importeanexo: any;
	montoxpago: any;
	numeropagos: any;
	observaciones: any;
	tarifa: any;
	vobo: any;
	Cliente: any;
	idperiodo: any;

  constructor(){
	  this.Cliente = {
		  idCliente: '',
		  nombreCliente: ''
	  };

	  this.idperiodo = {
		  idperiodo: '',
		  periodo: ''
	  };


  }
}
