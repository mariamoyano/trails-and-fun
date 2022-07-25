import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user.model';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  usernameInput: FormControl;
  passwordInput: FormControl

  constructor(
    private authService: AuthService,
    private router: Router
  ) {
    this.usernameInput = new FormControl('', [Validators.required]);
    this.passwordInput = new FormControl('', [Validators.required]);
    this.loginForm = new FormGroup({
      username: this.usernameInput,
      password: this.passwordInput
    });
  }

  ngOnInit(): void {
  }

  login() {
    this.authService.login(this.loginForm.value.username, this.loginForm.value.password).subscribe(
      (user: User) => {
        console.log('Login successful');
        console.log(user);
        // Store user in local storage to keep user logged in between page refreshes
        localStorage.removeItem('currentUser');
        localStorage.setItem('currentUser', JSON.stringify(user));


        // Redirect to home page
        this.router.navigate(['/']);
      }
    );
  }

}
