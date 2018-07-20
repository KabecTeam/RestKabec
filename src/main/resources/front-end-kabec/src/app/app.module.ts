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
//bryan
import { UserComponent } from './user/user.component';
import {UserService} from './user/user.service';
import {AddUserComponent} from './user/add-user.component';

import { BancoComponent } from './banco/banco.component';
import { BancoService } from './banco/banco.service';
import { AddBancoComponent } from './banco/add-banco.component';

import { NominaComponent } from './nomina/nomina.component';
import { NominaService } from './nomina/nomina.service';
import { AddNominaComponent } from './nomina/add-nomina.component';


import { ComplementoComponent } from './complemento/complemento.component';
import { ComplementoService } from './complemento/complemento.service';
import { AddComplementoComponent } from './complemento/add-complemento.component';

import { RepcontratoComponent } from './repcontrato/repcontrato.component';
import { ContratoService } from './repcontrato/repcontrato.service';
import { HeaderComponent } from './header/header.component';
import { ReporteasignadosComponent } from './reporteasignados/reporteasignados.component';
import { NoasignadosComponent } from './noasignados/noasignados.component';
import {LayoutModule} from 'angular-admin-lte';
import { adminLteConf } from './admin-lte.conf';


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
    AnexoComponent,
    UserComponent,
    AddUserComponent,
    BancoComponent,
    AddBancoComponent,
    NominaComponent,
    AddNominaComponent,
    ComplementoComponent,
    AddComplementoComponent,
    RepcontratoComponent,
    HeaderComponent,
    ReporteasignadosComponent,
    NoasignadosComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ServicioAreaService,
    PagosAnexosService, UserService, BancoService, NominaService, ComplementoService, ContratoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
