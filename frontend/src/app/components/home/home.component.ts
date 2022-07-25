import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  username: string | null;

  constructor() { 
    this.username = '';
  }

  ngOnInit(): void {
    // localStorage.getItem("currentUser");
    this.username = JSON.parse(localStorage.getItem("currentUser") as string).username;
  }

}
