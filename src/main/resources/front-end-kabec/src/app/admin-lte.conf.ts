export var adminLteConf = {
  skin: 'blue',
  sidebarLeftMenu: [
    {label: 'Reportes', iconClasses: 'fa fa-th',children:[
		  { label: 'Reporte de Contratos', route: '/contrato' },
		  { label: 'Reporte de Anexos', route: '/reporteAnexo' },
		  { label: 'Reporte de Consultores Asignados', route: '/reporteAsignados' }
		  ]
	  },
	{ label: 'Start', route: '/', iconClasses: 'fa fa-th' }
  ]
};