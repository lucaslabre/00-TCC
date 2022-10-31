import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatDialogModule } from '@angular/material/dialog';

import { TopbarComponent } from './components/topbar/topbar.component';
import { HttpClientModule } from '@angular/common/http';
import { EditorModule } from '@tinymce/tinymce-angular';
import { EditorComponent } from './components/editor/editor.component';
import { ContainerPageDirective } from './directives/container-page.directive';
import { MarginRightSm } from './directives/margin-right-small.directive';
import { MarginLeftMd } from './directives/margin-left-md.directive copy';
import { CreateCadernoDialogComponent } from './components/dialogs/create-caderno-dialog/create-caderno-dialog.component';


const tinyModules = [
  EditorModule
]

const materialModules = [
  MatButtonModule,
  MatCardModule,
  MatFormFieldModule,
  MatInputModule,
  MatIconModule,
  MatToolbarModule,
  MatSidenavModule,
  MatListModule,
  MatExpansionModule,
  MatSnackBarModule,
  MatDialogModule
]

const angularModules = [
  RouterModule,
  ReactiveFormsModule,
  HttpClientModule,
  FormsModule
]

const components = [
  TopbarComponent,
  EditorComponent,
  CreateCadernoDialogComponent
]

const directives = [
  ContainerPageDirective,
  MarginRightSm,
  MarginLeftMd
]

@NgModule({
  declarations: [
    ...components,
    ...directives
  ],
  imports: [
    CommonModule,
    ...materialModules,
    ...angularModules,
    ...tinyModules
  ],
  exports: [
    ...materialModules,
    ...angularModules,
    ...components,
    ...directives,
    ...tinyModules
  ]
})
export class SharedModule { }
