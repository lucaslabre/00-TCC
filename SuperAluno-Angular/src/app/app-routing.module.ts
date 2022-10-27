import { NgModule } from '@angular/core';
import { RouterModule, Routes, CanActivate } from '@angular/router';
import { LoginPageComponent } from './features/login/pages/login-page/login-page.component';
import { HomePageComponent } from './features/home/pages/home-page/home-page.component';
import { AppMainComponent } from './app.main.component';
import { CadernoPageComponent } from './features/cadernos/pages/caderno-page/caderno-page.component';
import { AuthGuard } from './shared/guards/auth.guard';
import { AuthenticationComponent } from './features/login/components/authentication/authentication.component';
import { EditorPageComponent } from './features/cadernos/pages/editor-page/editor-page.component';

const routes: Routes = [
  {
    path: '',
    component: AppMainComponent,
    children: [
      { path: '', component: HomePageComponent },
      { path: 'home', component: HomePageComponent },
      { path: 'meus-cadernos', component: CadernoPageComponent },
      { path: 'editar-caderno/:idAssunto', component: EditorPageComponent }
    ],
    canActivate: [AuthGuard]
  },
  {
    path: '',
    component: AuthenticationComponent,
    children: [
      { path: '', redirectTo: 'login', pathMatch: 'full' },
      { path: 'login', component: LoginPageComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
