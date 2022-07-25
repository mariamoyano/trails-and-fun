import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

    
  username!: string | null;

  constructor(
    private authService: AuthService,
    private router: Router,
    
    
  ) { }
  
  ngOnInit(): void {
    this.username = JSON.parse(localStorage.getItem("currentUser") as string).username;
  }

  logout(): void {
    console.log('logging out...');
    this.authService.logout();

    this.router.navigate(['/login']);

  }

}
