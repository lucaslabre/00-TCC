import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';

import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';


const materialModules = [
  MatButtonModule,
  MatCardModule,
  MatFormFieldModule,
  MatInputModule,
  MatIconModule
]

const angularModules = [
  ReactiveFormsModule
]

@NgModule({
  declarations: [

  ],
  imports: [
    CommonModule,
    ...materialModules,
    ...angularModules
  ],
  exports: [
    ...materialModules,
    ...angularModules
  ]
})
export class SharedModule { }
