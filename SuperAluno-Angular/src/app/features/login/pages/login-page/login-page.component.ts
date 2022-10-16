import { Component, OnInit } from '@angular/core';
import { Usuario } from '../../../usuarios/models/usuario.model';
import { UsuarioService } from '../../../usuarios/services/usuario.service';

@Component({
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.scss']
})
export class LoginPageComponent implements OnInit {

  usuario: Usuario = new Usuario();

  constructor(
    private usuarioService: UsuarioService
  ) { }

  ngOnInit(): void {}

  login() {
    let email = this.usuario.emailUsuario;
    let senha = this.usuario.senhaUsuario;
    console.log(email, senha);
    if(email != undefined && senha != undefined) {
      this.usuarioService.findUsuarioByEmailAndSenha(email, senha).subscribe({
        next: (usuario) => { this.usuario = usuario },
        error: (e) => { console.log(e) },
        complete: () => console.info('Método findUsuarioByEmailAndSenha executado com sucesso!')
      });
    }
  }

}
