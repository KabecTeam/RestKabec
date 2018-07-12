import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServicioAreaService } from './servicios/servicio-area.service';	
import {IndexComponent} from './index/index.component';
import {AreaComponent} from './area/area.component';
import { AddAreaComponent } from './add-area/add-area.component';
import {FormsModule} from '@angular/forms';
import { ClienteComponent } from './cliente/cliente.component';
import { DClienteComponent } from './d-cliente/d-cliente.component';
import { PagosAnexoComponent } from './pagos-anexo/pagos-anexo.component';
import { ReportePagosComponent } from './reporte-pagos/reporte-pagos.component';
import {PagosAnexosService} from './servicios/pagos-anexos.service';
import { AddAnexoComponent } from './add-anexo/add-anexo.component';
import { AnexoComponent } from './anexo/anexo.component';



@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    AreaComponent,
    AddAreaComponent,
    ClienteComponent,
    DClienteComponent,
    PagosAnexoComponent,
    ReportePagosComponent,
    AddAnexoComponent,
    AnexoComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ServicioAreaService,
  PagosAnexosService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
