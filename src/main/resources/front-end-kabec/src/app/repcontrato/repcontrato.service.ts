import {Injectable,Pipe, PipeTransform} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import * as FileSaver from 'file-saver';
import * as XLSX from 'xlsx';
import {UrlConfigService} from '../url-config.service';

import { Contrato } from '../models/contrato.model';
const EXCEL_TYPE = 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8';
const EXCEL_EXTENSION = '.xlsx';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Pipe({
  name: 'ubicacionConsultor'
})

@Injectable()
export class ContratoService{
  
  constructor(private http:HttpClient ,private urlConfig: UrlConfigService) {}

  private contratoUrl = UrlConfigService+'reportecontrato';

  public getContrato() {
    return this.http.get<Contrato[]>(this.contratoUrl);
  }

  public exportAsExcelFile(json: any[], excelFileName: string): void {
  const worksheet: XLSX.WorkSheet = XLSX.utils.json_to_sheet(json);
  const workbook: XLSX.WorkBook = { Sheets: { 'data': worksheet }, SheetNames: ['data'] };
  const excelBuffer: any = XLSX.write(workbook, { bookType: 'xlsx', type: 'buffer' });
  this.saveAsExcelFile([document.getElementById('tab_contrato').innerHTML], excelFileName);
}

private saveAsExcelFile(buffer: any, fileName: string): void {
  const data: Blob = new Blob([document.getElementById('tab_contrato').innerHTML], {
    type: EXCEL_TYPE
  });
  FileSaver.saveAs(data, fileName + '_export_' + new Date().getTime() + EXCEL_EXTENSION);
}
}
