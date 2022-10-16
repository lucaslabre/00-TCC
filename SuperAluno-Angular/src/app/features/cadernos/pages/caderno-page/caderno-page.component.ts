import { Component, OnInit } from '@angular/core';
import { Materia } from '../../../../shared/models/materia.model';
import { Caderno } from '../../../../shared/models/caderno.model';
import { CadernoService } from '../../services/caderno.service';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  templateUrl: './caderno-page.component.html',
  styleUrls: ['./caderno-page.component.scss']
})
export class CadernoPageComponent implements OnInit {

  materiasUsuario!: Materia[];
  cadernos!: Caderno[];

  form: FormGroup = new FormGroup({texto: new FormControl('')});

  constructor(
    private cadernoService: CadernoService
  ) { }

  ngOnInit(): void {



    this.cadernoService.findAllCadernoByUsuario(1).subscribe((cadernos) => this.cadernos = cadernos);

  }

  createForm(texto: String) {
    this.form = new FormGroup({
      texto: new FormControl(texto)
    })
    //
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
