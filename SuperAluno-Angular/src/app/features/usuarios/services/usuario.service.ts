import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private API = "http://localhost/usuarios";

  constructor(private http: HttpClient) { }


}
