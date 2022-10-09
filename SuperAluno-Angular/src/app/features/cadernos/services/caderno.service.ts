import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Caderno } from '../../../shared/models/caderno.model';

@Injectable({
  providedIn: 'root'
})
export class CadernoService {

  private API: string = 'http://localhost:8080/cadernos';

  constructor(private http: HttpClient) { }

  public findAllCadernoByUsuario(idUsuario: number): Observable<Caderno[]> {
    return this.http.get<Caderno[]>(`${this.API}/${idUsuario}`);
  }

  public findCadernoById(idCaderno: number): Observable<Caderno> {
    let params = new HttpParams().set('idCaderno', idCaderno)
    return this.http.get<Caderno>(`${this.API}`,{ params: params });
  }

}
