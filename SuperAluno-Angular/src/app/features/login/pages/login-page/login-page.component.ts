import { Component, OnInit } from '@angular/core';
import { Usuario } from '../../../usuarios/models/usuario.model';

@Component({
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.scss']
})
export class LoginPageComponent implements OnInit {

  usuario!: Usuario;

  constructor() { }

  ngOnInit(): void {

  }

}
