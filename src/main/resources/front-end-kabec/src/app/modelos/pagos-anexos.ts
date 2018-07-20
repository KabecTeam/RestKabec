export class PagosAnexos {
	idpago: any;
	deuda: any;
	fechafacturacion: any;
	fechainiciofactura;
	fechainiciopago: any;
	fechapago:any
	importe: any;
	montopago: any;
	numeropago: any;
	pagosfaltantes: any;
	saldo: any;
	anexo: any;
	facturas: any;
	Periodo: any;
	persona: any;
	

	constructor(){
		this.persona = {
			idpersona: '',


		};

		this.anexo = {
			idanexo: ''

		};
		this.Periodo = {
			idperiodo: ''
		};

		this.facturas={
			idfactura:''
		}
	}



	public set periodo(v : number) {
		this.Periodo.idperiodo = v;
	}
}
