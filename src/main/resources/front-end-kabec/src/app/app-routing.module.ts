import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddAreaComponent} from './add-area/add-area.component';
import {AreaComponent} from './area/area.component';
import {ClienteComponent} from './cliente/cliente.component';
import {ReportePagosComponent} from './reporte-pagos/reporte-pagos.component';
import {PagosAnexoComponent} from './pagos-anexo/pagos-anexo.component';
import {AnexoComponent} from './anexo/anexo.component';
import {AddAnexoComponent} from './add-anexo/add-anexo.component';
const routes: Routes = [
	{path: '', component: AddAreaComponent },
	{path:'showAreas', component: AreaComponent},
	{path:'ShowClientes',component:ClienteComponent},
	{path:'reporteAnexo', component:ReportePagosComponent},
	{path: 'pagoAnexo', component: PagosAnexoComponent},
	{path: 'addAnexo', component: AddAnexoComponent},
	{path:'showAnexos',component: AnexoComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
