import { Component, OnInit } from '@angular/core';
import { Caderno } from '../../../../shared/models/caderno.model';
import { CadernoService } from '../../services/caderno.service';
import { FormControl, FormGroup } from '@angular/forms';
import { UsuarioService } from '../../../usuarios/services/usuario.service';
import { Usuario } from '../../../usuarios/models/usuario.model';
import { Assunto } from '../../../../shared/models/assunto.model';

@Component({
  templateUrl: './caderno-page.component.html',
  styleUrls: ['./caderno-page.component.scss']
})
export class CadernoPageComponent implements OnInit {

  usuarioAtual!: Usuario;
  materiasUsuario: string[] = [];
  cadernosUsuario!: Caderno[];
  assuntosUsuario: Assunto[] = [];
  panelOpenState: boolean = false;

  form: FormGroup = new FormGroup({texto: new FormControl('')});

  constructor(
    private usuarioService: UsuarioService,
    private cadernoService: CadernoService
  ) { }

  ngOnInit(): void {

    this.usuarioAtual = this.usuarioService.getUsuario();

    // this.cadernoService.findAllCadernoByUsuario(this.usuarioAtual.idUsuario).subscribe((cadernos) => this.cadernos = cadernos);
    this.cadernoService.findAllCadernoByUsuario(1).subscribe((cadernos) => {
      this.cadernosUsuario = cadernos;
      this.setAssuntos(this.cadernosUsuario);
      this.setMaterias(this.assuntosUsuario);
    });

  }

  setAssuntos(cadernos: Caderno[]) {
    cadernos.forEach(caderno => this.assuntosUsuario.push(caderno.assunto));
  }

  setMaterias(assuntos: Assunto[]) {
    assuntos.forEach(assunto => {
      if(!this.materiasUsuario.includes(assunto.materia.nomeMateria)) {
        this.materiasUsuario.push(assunto.materia.nomeMateria)
      }
    });
    console.log(this.materiasUsuario);
  }

  createForm(texto: String) {
    this.form = new FormGroup({
      texto: new FormControl(texto)
    })
  }

  onSubmit() {
    if(this.form){
      console.log(this.form.value);
    }
  }

  puxarDoBanco(idCaderno: number) {
    this.cadernoService.findCadernoById(idCaderno).subscribe((v) => this.createForm(v.conteudo));
  }

}
