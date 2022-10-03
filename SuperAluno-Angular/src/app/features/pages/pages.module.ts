import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginPageComponent } from './login-page/login-page.component';
import { SharedModule } from '../../shared/shared.module';
import { HomePageComponent } from './home-page/home-page.component';
import { CadernoPageComponent } from './caderno-page/caderno-page.component';


@NgModule({
  declarations: [
    LoginPageComponent,
    HomePageComponent,
    CadernoPageComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class PagesModule { }
