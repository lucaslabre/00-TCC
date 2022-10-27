import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CadernoPageComponent } from './pages/caderno-page/caderno-page.component';
import { MateriaListComponent } from './components/materia-list/materia-list.component';
import { SharedModule } from '../../shared/shared.module';
import { EditorPageComponent } from './pages/editor-page/editor-page.component';



@NgModule({
  declarations: [
    CadernoPageComponent,
    MateriaListComponent,
    EditorPageComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class CadernosModule { }
