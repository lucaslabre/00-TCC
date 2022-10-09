import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from './features/login/pages/login-page/login-page.component';
import { HomePageComponent } from './features/home/pages/home-page/home-page.component';
import { AppMainComponent } from './app.main.component';
import { CadernoPageComponent } from './features/cadernos/pages/caderno-page/caderno-page.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'login' },
  { path: 'login', component: LoginPageComponent },
  {
    path: 'home', component: AppMainComponent, children: [
      { path: '', component: HomePageComponent }
    ]
  },
  {
    path: 'meus-cadernos', component: AppMainComponent, children: [
      { path: '', component: CadernoPageComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
