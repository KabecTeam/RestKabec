import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientModule } from '@angular/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServicoAreaService } from './servicios/servicio-area.service';		
const path: [
	{
	}

];

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    H
  ],
  providers: [ServicoAreaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
