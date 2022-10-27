import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { CadernoService } from '../../services/caderno.service';
import { ActivatedRoute } from '@angular/router';
import { Caderno } from '../../../../shared/models/caderno.model';

@Component({
  templateUrl: './editor-page.component.html',
  styleUrls: ['./editor-page.component.scss']
})
export class EditorPageComponent implements OnInit {

  form: FormGroup = new FormGroup({texto: new FormControl('')});
  caderno?: Caderno;

  constructor(
    private cadernoService: CadernoService,
    private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
    const idAssunto = this.activatedRoute.snapshot.paramMap.get('idAssunto');
    this.cadernoService.findCadernoByIdAssunto(idAssunto).subscribe(caderno => {
      console.log(this.caderno = caderno);
      this.createForm(this.caderno.conteudo);
    });
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

}
