import { UserDetailsComponent } from './user-details/user-details.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { CreateNidComponent } from './create-nid/create-nid.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { NidListComponent } from './nid-list/nid-list.component';
import { FormUploadComponent } from './upload/form-upload/form-upload.component'
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'users', component: UserListComponent },
  { path: 'add', component: CreateUserComponent },
  { path: 'addNid', component: CreateNidComponent},
  { path: 'NIDs', component: NidListComponent },
  { path: 'postNid', component: FormUploadComponent },
  { path: 'signin', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'signup', component: RegisterComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }