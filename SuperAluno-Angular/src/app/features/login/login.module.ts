import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginPageComponent } from './pages/login-page/login-page.component';
import { SharedModule } from '../../shared/shared.module';
import { AuthenticationComponent } from './components/authentication/authentication.component';



@NgModule({
  declarations: [
    LoginPageComponent,
    AuthenticationComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class LoginModule { }
