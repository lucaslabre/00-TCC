import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.scss']
})
export class EditorComponent implements OnInit {

  form: FormGroup = new FormGroup({texto: new FormControl('')});

  constructor() { }

  ngOnInit(): void {
  }

}
