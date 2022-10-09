import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CadernoPageComponent } from './pages/caderno-page/caderno-page.component';
import { MateriaListComponent } from './components/materia-list/materia-list.component';
import { SharedModule } from '../../shared/shared.module';



@NgModule({
  declarations: [
    CadernoPageComponent,
    MateriaListComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class CadernosModule { }
