//modelo de configuracion para el navbar, muestra menus y sub menus

export var adminLteConf = {
  skin: 'blue',
  layout: 'fixed',
  sidebarLeftMenu: [
	{ label: 'Menu de Navegación', separator: true },
	  {
		  label: 'Reportes', iconClasses: 'fa fa-dashboard', children: [
		  	  { label: 'Contratos', iconClasses: 'none', route: '/contrato' },
			  { label: 'Pago de Anexos', iconClasses: 'none', route: '/reporteAnexo' },
			  { label: 'Consultores Asignados', iconClasses: 'none', route: '/reporteAsignados' },
			  { label: 'Consultores no Asignados', iconClasses: 'none', route: '/noasignados' }
		  ]
	  },
	{ label: 'Catalogos',iconClasses: 'fa fa-dashboard',children:[
		{label:'Anexo',children:[
			{ label: 'Anexos', iconClasses: 'none', route: '/showAnexos' },
			{ label: 'Agregar Anexo', iconClasses: 'none', route: '/addAnexo' }
		]},
		{label:'Area',children:[
			{ label: 'Areas', iconClasses: 'none', route: '/showAreas' },
			{ label: 'Agregar Area', iconClasses: 'none', route: '/addAreas' }
		]},

		{ label:'Banco',children:[
			{ label: 'Bancos', iconClasses: 'none', route: '/bancos' },
			{ label: 'Agregar Banco', iconClasses: 'none', route: '/addbancos' }
		]},
		{label:'Cliente',children:[
			{ label: 'Clientes', iconClasses: 'none', route: '/ShowClientes' },
			{ label: 'Agregar Cliente', iconClasses: 'none', route: '/addCliente' }
		]},
		{label:'Complemento',children:[
			{ label: 'Complementos', iconClasses: 'none', route: '/complemento' },
			{ label: 'Agregar Complemento', iconClasses: 'none', route: '/addcomplemento' },
		]}
	]},

	  { label: 'Registro Pagos', iconClasses: 'fa fa-dashboard', children: [
		  { label: 'Pago de Anexo', iconClasses: 'none', route: '/pagoAnexo' }
	  ]},

	  {label:'Inicio', iconClasses:'fa fa-dashboard', children:[
	  	  {label:'Indice de Consultores',iconClasses:'none',route:'/'}
	  ]},

	  {label:'Metricas', iconCLasses:'fa fa-dashboard',children:[
	  ]},

	  {label:'Administración',iconClasses:'fa fa-dashboard',children:[
		  { label: 'Nuevo Usuario', iconClasses: 'none', route: '/nuevousuario' },
		  { label: 'Consultar Usuario', iconClasses: 'none', route: '/consultarusuario' }
	  ]},
	  {label:'Contratación',iconClasses:'fa fa-dashboard',children:[
		  { label: 'Nuevo Consultor', iconClasses: 'none', route: '/nuevoconsultor' },
		  { label: 'Búsqueda de Consultor', iconClasses: 'none', route: '/buscarconsultor' },
		  { label: 'Bajas', iconClasses: 'none', route: '/consultarbajas' }
	  ]}
		
  ]
	}
