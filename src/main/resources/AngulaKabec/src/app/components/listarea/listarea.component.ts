import { Component, OnInit } from '@angular/core';
import {AreaService}  from '../../servicios/area.service';
import {Area} from '../../modelos/area';

@Component({
  selector: 'app-listarea',
  templateUrl: './listarea.component.html',
  styleUrls: ['./listarea.component.css']
})

export class ListareaComponent implements OnInit {
	private areas:Area[];

  constructor( private _areaService: AreaService) { }

  ngOnInit() {


	  this._areaService.getAreas().subscribe((areas) => {
		  console.log(areas);
		  this.areas = areas;
	  }, (error) => {
		  console.log(error);
	  })
	 
  	}

  	delArea(area: Area) {
		this._areaService.deleteArea(area.idArea).subscribe((area) => {
			this.areas.splice(this.areas.indexOf(area), 1);
		}, (error) => {
			console.log(error);
		})
  }
 
}
