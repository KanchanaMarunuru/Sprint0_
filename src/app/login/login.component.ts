
import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { User } from 'src/app/user';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loginForm!: FormGroup;
  submitted = false;
  user: User=new User();



  constructor(private formBuilder: FormBuilder, private loginService: LoginService, private router: Router) { }

  ngOnInit():void {
      this.loginForm = this.formBuilder.group({
          email: ['', [Validators.required, Validators.email]],
          password: ['', [Validators.required, Validators.pattern(
              '^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,}$'
            )]],
      });
  }

  // convenience getter for easy access to form fields
  get f() { return this.loginForm.controls; }



  getemail() {
   this.loginService.createUser(this.user).subscribe(data=>{
    console.log(data);
    alert('Welcome!!!');
    this.goToCandidateList();
     }),
    error=>console.log(error);
    }

  goToCandidateList(){
     this.router.navigate(['/candidate']);
   }

  onSubmit() {
      this.submitted = true;


      // stop here if form is invalid
      if (this.loginForm.invalid) {
          return;
      }

      else{
        this.getemail();
      }
  }

  onReset() {
      this.submitted = false;
      this.loginForm.reset();
  }


}
