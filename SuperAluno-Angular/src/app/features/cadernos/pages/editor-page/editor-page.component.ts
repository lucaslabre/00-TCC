import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { CadernoService } from '../../services/caderno.service';
import { ActivatedRoute } from '@angular/router';
import { Caderno } from '../../../../shared/models/caderno.model';
import { MatSnackBar, MatSnackBarHorizontalPosition, MatSnackBarVerticalPosition } from '@angular/material/snack-bar';

@Component({
  templateUrl: './editor-page.component.html',
  styleUrls: ['./editor-page.component.scss']
})
export class EditorPageComponent implements OnInit {

  form: FormGroup = new FormGroup({texto: new FormControl('')});
  caderno!: Caderno;
  horizontalPosition: MatSnackBarHorizontalPosition = 'center';
  verticalPosition: MatSnackBarVerticalPosition = 'top';

  constructor(
    private cadernoService: CadernoService,
    private activatedRoute: ActivatedRoute,
    private _snackBar: MatSnackBar
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

  salvarConteudo() {
    if(this.form){
      console.log(this.form.value);
      this.caderno.conteudo = this.form.value['texto'];
      this.cadernoService.salvarConteudo(this.caderno).subscribe();

      this._snackBar.open('Seu caderno está salvo :)', 'Entendi', {
        duration: 3000,
        horizontalPosition: this.horizontalPosition,
        verticalPosition: this.verticalPosition,
      });
    }
  }

}
