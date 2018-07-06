import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServicioAreaService } from './servicios/servicio-area.service';	
import {IndexComponent} from './index/index.component';
import {AreaComponent} from './area/area.component';	


@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    AreaComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ServicioAreaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
