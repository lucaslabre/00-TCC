import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Usuario } from '../models/usuario.model';
import { Observable, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private API = "http://localhost:8080/usuarios";
  private usuario!: Usuario;
  private usuarioAutenticado: boolean = false;

  constructor(private http: HttpClient) { }

  getUsuario(): Usuario {
    return this.usuario;
  }

  isUsuarioAutenticado() {
    return this.usuarioAutenticado;
  }

  findUsuarioByEmailAndSenha(email: string, senha: string) {
    let params = {
      'email': email,
      'senha': senha
    }

    return this.http.get<Usuario>(`${this.API}/validar`, { params: params }).pipe(
      tap(usuario => {this.usuario = usuario; this.usuarioAutenticado = true})
    )
  }

}
