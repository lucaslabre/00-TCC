import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Caderno } from '../models/caderno.model';

@Injectable({
  providedIn: 'root'
})
export class CadernoService {

  private API: string = 'http://localhost:8080/cadernos';

  constructor(private http: HttpClient) { }

  public findAllByUsuario(idUsuario: number): Observable<Caderno[]> {
    return this.http.get<Caderno[]>(`${this.API}/${idUsuario}`);
  }

}
