import { NgModule } from '@angular/core';
import { RouterModule, Routes, CanActivate } from '@angular/router';
import { LoginPageComponent } from './features/login/pages/login-page/login-page.component';
import { HomePageComponent } from './features/home/pages/home-page/home-page.component';
import { AppMainComponent } from './app.main.component';
import { CadernoPageComponent } from './features/cadernos/pages/caderno-page/caderno-page.component';
import { AuthGuard } from './shared/guards/auth.guard';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'login' },
  { path: 'login', component: LoginPageComponent },
  {
    path: 'home', component: AppMainComponent, canActivate: [AuthGuard] , children: [
      { path: '', component: HomePageComponent }
    ]
  },
  {
    path: 'meus-cadernos', component: AppMainComponent, canActivate: [AuthGuard], children: [
      { path: '', component: CadernoPageComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
