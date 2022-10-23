import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Usuario } from '../models/usuario.model';
import { Observable, tap, firstValueFrom } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private API = "http://localhost:8080/usuarios";

  constructor(private http: HttpClient) { }

  async login(user: Usuario): Promise<void> {

    if(user.emailUsuario && user.senhaUsuario) {
      let params = {
        'email': user.emailUsuario,
        'senha': user.senhaUsuario
      }

      try {
      const observable = this.http.get<Usuario>(`${this.API}/validar`, { params: params });

      const result: Usuario = await firstValueFrom(observable);
      if(result) {
        window.sessionStorage.setItem('token', JSON.stringify(result));
      }
      console.log('value -> ', result);
      } catch(error) {
        console.error("Autenticação Inválida!");
      }

    }
  }

  cadastrar(account: any) {
    return new Promise((resolve) => {
      resolve(true);
    });
  }

  getUsuario(): Usuario | null {
    let token = window.sessionStorage.getItem('token');
    if(token){
      let user: Usuario = JSON.parse(token);
      return user;
    }
    return null;
  }

}
