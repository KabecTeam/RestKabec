import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AreaComponent } from './area/area.component';
import {IndexComponent} from './index/index.component';
const routes: Routes = [
	{path:'', component: IndexComponent},
	{path:'showAreas', component: AreaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
