import { NgxAdminLteModule } from 'ngx-admin-lte';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule, Http } from '@angular/http';
import { NgModule } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import {FormsModule} from '@angular/forms';
import { CoreModule } from './core/core.module';


import { AppComponent } from './app.component';
import { ServicioAreaService } from './servicios/servicio-area.service';

import { AreaComponent } from './area/area.component';
import { AddAreaComponent } from './add-area/add-area.component';
import { ClienteComponent } from './cliente/cliente.component';
import { DClienteComponent } from './d-cliente/d-cliente.component';
import { PagosAnexoComponent } from './pagos-anexo/pagos-anexo.component';
import { ReportePagosComponent } from './reporte-pagos/reporte-pagos.component';
import {PagosAnexosService} from './servicios/pagos-anexos.service';
import { AddAnexoComponent } from './add-anexo/add-anexo.component';
import { AnexoComponent } from './anexo/anexo.component';
//bryan
import { UserComponent } from './user/user.component';
import {AddUserComponent} from './user/add-user.component';

import { BancoComponent } from './banco/banco.component';
import { BancoService } from './banco/banco.service';
import { AddBancoComponent } from './banco/add-banco.component';

import { NominaService } from './nomina/nomina.service';
import { AddNominaComponent } from './nomina/add-nomina.component';
import { NominaComponent } from './nomina/nomina.component';

import { ComplementoComponent } from './complemento/complemento.component';
import { ComplementoService } from './complemento/complemento.service';
import { AddComplementoComponent } from './complemento/add-complemento.component';

import { RepcontratoComponent } from './repcontrato/repcontrato.component';
import { ContratoService } from './repcontrato/repcontrato.service';
import { ReporteasignadosComponent } from './reporteasignados/reporteasignados.component';
import { NoasignadosComponent } from './noasignados/noasignados.component';

import { LayoutModule } from 'angular-admin-lte';   
import { BoxModule } from 'angular-admin-lte';   
import { adminLteConf } from './admin-lte.conf'; 
import { LoadingPageModule, MaterialBarModule } from 'angular-loading-page';
import {NuevoUsuario} from '../nuevousuario/nuevousuario.component';
import {NuevoConsultor} from './nuevoconsultor/nuevoconsultor.component';
import {ConsultarUsuario} from './consultarusuario/consultarusuario.component';
import {BuscarConsultor} from './buscarconsultor/buscarconsultor.component';
import {ConsultarBajas} from './consultarbajas/consultarbajas.component';
import { GotoindexComponent } from './gotoindex/gotoindex.component';
import { InisessionComponent } from './inisession/inisession.component';

@NgModule({
  declarations: [
    //lAYOUTS
    ConsultarBajas,
    BuscarConsultor,
    NuevoConsultor,
    ConsultarUsuario,
    NuevoUsuario,
    AppComponent,
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
    ReporteasignadosComponent,
    NoasignadosComponent,
    GotoindexComponent,
    InisessionComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgxAdminLteModule,
    BoxModule,
    LayoutModule.forRoot(adminLteConf), 
    CoreModule,
    LoadingPageModule, MaterialBarModule

  ],
  providers: [
      ServicioAreaService,
      PagosAnexosService,  
      BancoService, 
      NominaService, 
      ComplementoService, 
      ContratoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
