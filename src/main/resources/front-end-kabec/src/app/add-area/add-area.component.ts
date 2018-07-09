import { Component, OnInit } from '@angular/core';
import {ServicioAreaService} from '../servicios/servicio-area.service';
import {Area} from '../modelos/area';
import {Router} from '@angular/router';

@Component({
  selector: 'app-add-area',
  templateUrl: './add-area.component.html',
  styleUrls: ['./add-area.component.css']
})
export class AddAreaComponent implements OnInit {
	private area = new Area[];
  constructor(private _router: Router,private _areaServicio: ServicioAreaService) { }

  ngOnInit() {
  }

  

}
 