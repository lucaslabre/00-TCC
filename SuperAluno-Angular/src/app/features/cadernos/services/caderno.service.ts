import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Caderno } from '../../../shared/models/caderno.model';
import { Usuario } from '../../usuarios/models/usuario.model';

@Injectable({
  providedIn: 'root'
})
export class CadernoService {

  private API: string = 'http://localhost:8080/cadernos';

  constructor(private http: HttpClient) { }

  public findAllCadernoByUsuario(usuario: Usuario): Observable<Caderno[]> {
    return this.http.get<Caderno[]>(`${this.API}/usuario/${usuario.idUsuario}`);
  }

  findCadernoByIdAssunto(idAssunto: string | null): Observable<Caderno> {
    return this.http.get<Caderno>(`${this.API}/assunto/${idAssunto}`);
  }

  findCadernoByIdCaderno(idCaderno: string | null): Observable<Caderno> {
    return this.http.get<Caderno>(`${this.API}/${idCaderno}`);
  }

  salvarConteudo(caderno: Caderno) {
    return this.http.put<Caderno>(`${this.API}`, caderno)
  }

  createCaderno(caderno: Caderno): Observable<Caderno> {
    return this.http.post<Caderno>(`${this.API}`, caderno);
  }

}
