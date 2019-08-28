import { Observable } from "rxjs";
import { UserService } from "./../user.service";
import { DosUser } from "./../user";
import { nid } from "./../nid";
import { NidService } from "./../nid.service";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

    users: Observable<DosUser[]>;

  constructor(private userService: UserService,private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.users = this.userService.getUserList();
  }

  deleteUser(id: number) {
    this.userService.deleteUser(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }
  public gotoNidCreate(url, id) {
    this.router.navigate([url, id]).then( (e) => {
      if (e) {
        console.log("Navigation is successful!");
      } else {
        console.log("Navigation has failed!");
      }
    });
  }
}