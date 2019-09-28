import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { TaskmanagerComponent } from './taskmanager/taskmanager.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';


const routes: Routes = [{path:'',component:HomeComponent},
                        {path:'user',component:UsersComponent},
                      { path:'task',component:TaskmanagerComponent},
                    { path:'**',component:PagenotfoundComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
