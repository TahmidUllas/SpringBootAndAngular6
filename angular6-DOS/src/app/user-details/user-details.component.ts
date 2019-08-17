import { DosUser } from './../user';
import { UserService } from '../user.service';
import { UserListComponent } from '../user-list/user-list.component';
import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {
  
  @Input() user: DosUser;

  constructor(private userService: UserService, private listComponent: UserListComponent) { }

  ngOnInit() {
  }
}