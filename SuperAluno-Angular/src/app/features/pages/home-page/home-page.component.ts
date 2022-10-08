import { Component, OnInit } from '@angular/core';
import { Materia } from '../../../shared/models/materia.model';
import { Caderno } from '../../../shared/models/caderno.model';
import { CadernoService } from '../../../shared/services/caderno.service';

export interface Section {
  name: string;
  updated: Date;
}

@Component({
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})

export class HomePageComponent implements OnInit {

  materias!: Materia[];
  cadernos!: Caderno[];

  constructor(
    private cadernoService: CadernoService
  ) { }

  ngOnInit(): void {

      this.materias = [
        {
          idCaderno : 1,
          conteudo : "de constante<\/strong> e em linha reta.<\/p>"
        },
        {
          idCaderno : 2,
          conteudo : "teste"
        }
      ]

      this.cadernoService.findAllCadernoByUsuario(1).subscribe((cadernos) => this.cadernos = cadernos);

  }

}
