import { Component, OnInit } from '@angular/core';
import { Caderno } from '../../../models/caderno.model';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CadernoService } from '../../../../features/cadernos/services/caderno.service';
import { Assunto } from '../../../models/assunto.model';
import { Materia } from '../../../models/materia.model';
import { Usuario } from '../../../../features/usuarios/models/usuario.model';
import { MatDialogRef } from '@angular/material/dialog';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-caderno-dialog',
  templateUrl: './create-caderno-dialog.component.html',
  styleUrls: ['./create-caderno-dialog.component.scss']
})
export class CreateCadernoDialogComponent implements OnInit {

  caderno!: Caderno;
  assunto!: Assunto;
  materia!: Materia;
  usuario!: Usuario;

  form: FormGroup = new FormGroup({
    nomeMateria: new FormControl('', [Validators.required]),
    nomeAssunto: new FormControl('', [Validators.required])
  });

  constructor(
    private cadernoService: CadernoService,
    private router: Router,
    private dialogRef: MatDialogRef<CreateCadernoDialogComponent>
  ) { }

  ngOnInit(): void {
    this.caderno = new Caderno();
    this.assunto = new Assunto();
    this.materia = new Materia();
    this.caderno.assunto = this.assunto;
    this.caderno.assunto.materia = this.materia;
    let teste = sessionStorage.getItem('token');
    if(teste != null) {
      this.usuario = JSON.parse(teste);
    }
    console.log(this.usuario);
    this.caderno.usuario = this.usuario;
  }

  createCaderno() {
    if(this.form.valid){
      this.caderno.assunto.nomeAssunto = this.form.value['nomeAssunto'];
      this.caderno.assunto.materia.nomeMateria = this.form.value['nomeMateria'];
      console.log(this.caderno);
      this.cadernoService.createCaderno(this.caderno).subscribe((caderno) => {
        this.caderno = caderno;
        console.log(this.caderno);
        this.router.navigate([`/editar-caderno/${this.caderno.idCaderno}`]);
      });
      this.dialogRef.close();
    }
  }

  cancel() {
    this.dialogRef.close();
  }

}
