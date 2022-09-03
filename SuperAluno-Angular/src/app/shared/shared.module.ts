import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';

import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';

import { TopbarComponent } from './components/topbar/topbar.component';


const materialModules = [
  MatButtonModule,
  MatCardModule,
  MatFormFieldModule,
  MatInputModule,
  MatIconModule,
  MatToolbarModule,
  MatSidenavModule
]

const angularModules = [
  RouterModule,
  ReactiveFormsModule
]

const components = [
  TopbarComponent
]

@NgModule({
  declarations: [
    ...components
  ],
  imports: [
    CommonModule,
    ...materialModules,
    ...angularModules
  ],
  exports: [
    ...materialModules,
    ...angularModules,
    ...components
  ]
})
export class SharedModule { }
