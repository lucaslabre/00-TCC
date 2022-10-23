import { Component, OnInit } from '@angular/core';
import { Usuario } from '../../../usuarios/models/usuario.model';
import { UsuarioService } from '../../../usuarios/services/usuario.service';
import { Router } from '@angular/router';

@Component({
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.scss']
})
export class LoginPageComponent implements OnInit {

  usuario: Usuario = new Usuario();

  constructor(
    private usuarioService: UsuarioService,
    private router: Router
  ) { }

  ngOnInit(): void {}

  async login() {
    try {
      await this.usuarioService.login(this.usuario);
      this.router.navigate(['']);
    } catch(error) {
      console.error(error);
    }
  }

}
