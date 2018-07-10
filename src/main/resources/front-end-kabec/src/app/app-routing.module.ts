import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AddAreaComponent} from './add-area/add-area.component';
import {AreaComponent} from './area/area.component';
import {ClienteComponent} from './cliente/cliente.component';

const routes: Routes = [
	{path: '', component: AddAreaComponent },
	{path:'showAreas', component: AreaComponent},
	{path:'ShowClientes',component:ClienteComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
