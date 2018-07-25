import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddAreaComponent} from './add-area/add-area.component';
import {AreaComponent} from './area/area.component';
import {ClienteComponent} from './cliente/cliente.component';
import {ReportePagosComponent} from './reporte-pagos/reporte-pagos.component';
import {PagosAnexoComponent} from './pagos-anexo/pagos-anexo.component';
import {AnexoComponent} from './anexo/anexo.component';
import {AddAnexoComponent} from './add-anexo/add-anexo.component';
import {DClienteComponent} from './d-cliente/d-cliente.component';
//bryans
import { UserComponent } from './user/user.component';
import { AddUserComponent } from './user/add-user.component';

import { BancoComponent } from './banco/banco.component';
import { AddBancoComponent } from './banco/add-banco.component';

import { NominaComponent } from './nomina/nomina.component';
import { AddNominaComponent } from './nomina/add-nomina.component';

import { ComplementoComponent } from './complemento/complemento.component';
import { AddComplementoComponent } from './complemento/add-complemento.component';

import { RepcontratoComponent } from './repcontrato/repcontrato.component';
import { ReporteasignadosComponent } from './reporteasignados/reporteasignados.component';
import {NoasignadosComponent} from './noasignados/noasignados.component';
import {NuevoUsuario} from '../nuevousuario/nuevousuario.component';
import {ConsultarUsuario} from './consultarusuario/consultarusuario.component';
import {NuevoConsultor} from './nuevoconsultor/nuevoconsultor.component';
import {BuscarConsultor} from './buscarconsultor/buscarconsultor.component';
import {ConsultarBajas} from './consultarbajas/consultarbajas.component';

const routes: Routes = [
	
	{ path: 'reporteAsignados', component: ReporteasignadosComponent },
	{ path:'noasignados', component:NoasignadosComponent},
	{ path: 'addCliente', component: DClienteComponent },
	{ path: 'addAreas', component: AddAreaComponent },
	{ path:'showAreas', component: AreaComponent},
	{ path:'ShowClientes',component:ClienteComponent},
	{ path:'reporteAnexo', component:ReportePagosComponent},
	{ path: 'pagoAnexo', component: PagosAnexoComponent},
	{ path: 'addAnexo', component: AddAnexoComponent},
	{ path:'showAnexos',component: AnexoComponent},
//bryan
	{ path: 'users', component: UserComponent },
	{ path: 'add', component: AddUserComponent },

	{ path: 'bancos', component: BancoComponent },
	{ path: 'addbancos', component: AddBancoComponent },

	{ path: 'nomina', component: NominaComponent },
	{ path: 'addnomina', component: AddNominaComponent },

	{ path: 'complemento', component: ComplementoComponent },
	{ path: 'addcomplemento', component: AddComplementoComponent },

	{ path: 'contrato', component: RepcontratoComponent },
	{ path:'nuevousuario', component:NuevoUsuario, pathMatch:'full'},
	{ path: 'consultarusuario', component: ConsultarUsuario, pathMatch: 'full' },
	{ path:'nuevoconsultor', component:NuevoConsultor, pathMatch:'full'},
	{ path: 'buscarconsultor', component: BuscarConsultor, pathMatch: 'full' },
	{ path: 'consultarbajas', component: ConsultarBajas, pathMatch: 'full' },

];

@NgModule({
	imports: [RouterModule.forRoot(routes, { useHash: true })],
  	exports: [RouterModule]
})
export class AppRoutingModule { }
