import { UserDetailsComponent } from './user-details/user-details.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { CreateNidComponent } from './create-nid/create-nid.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { NidListComponent } from './nid-list/nid-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'user', pathMatch: 'full' },
  { path: 'users', component: UserListComponent },
  { path: 'add', component: CreateUserComponent },
  { path: 'addNid', component: CreateNidComponent},
  { path: 'NIDs', component: NidListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }