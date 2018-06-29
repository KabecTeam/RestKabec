import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HttpModule} from '@angular/http';

import { AppComponent } from './app.component';
import { ListareaComponent } from './components/listarea/listarea.component';
import { AreaFormComponent } from './components/area-form/area-form.component';
import {AreaService} from './servicios/area.service';

const appRoutes: Routes=[
  {path:'',component:ListareaComponent},
  {path:'op',component:AreaFormComponent}

];
@NgModule({
  declarations: [
    AppComponent,
    ListareaComponent,
    AreaFormComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [AreaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
