import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {Area} from '../modelos/area';
import {ServicioAreaService} from '../servicios/servicio-area.service';



@Component({
  selector: 'app-area',
  templateUrl: './area.component.html',
  styleUrls: ['./area.component.css']
})
export class AreaComponent implements OnInit {
  public areas: Area[];

  constructor(private _router: Router, private _areaService:ServicioAreaService) { }


  ngOnInit() {

  	this._areaService.getAll().subscribe( 
  		result=>{
  			if (result.code!="200"){
  				console.log(result);
				this.areas = result;
  			}else{
					this.areas = result.data;
  			}
  		},
  		Error=>{
  			//console.log(<any>Error);
  		})
  }

  deleteArea(area:Area): void{
    this._areaService.deleteArea(area)
    .subscribe ( data=>{
      this.areas = this.areas.filter(u => u != area);
      })

  };

 
}
