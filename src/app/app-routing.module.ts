import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//import { AppModule } from './app.module';
//import { FormsModule, ReactiveFormsModule } from '@angular/forms';
// import { CandidateComponent } from './candidate/candidate.component';
import { LoginComponent } from './login/login.component';
import { CandidateComponent } from './candidate/candidate.component';
import { FormsModule } from '@angular/forms';

const routes: Routes = [

  //{path:'',component:LoginComponent},
  //{path:'candidate',component:CandidateComponent},
  {path:'',component:LoginComponent},
  {path:'candidate',component:CandidateComponent},
  // {
  //   path: '', component:LoginComponent
  // },
  // {
  //   path: 'candidate', component:CandidateComponent
  // },




    ];



@NgModule({
  imports: [RouterModule.forRoot(routes),
    FormsModule,

  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
