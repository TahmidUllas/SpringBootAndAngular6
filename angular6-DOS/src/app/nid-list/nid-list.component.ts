import { Observable } from "rxjs";
import { UserService } from "./../user.service";
import { DosUser } from "./../user";
import { Nid } from "./../nid";
import { NidService } from "./../nid.service";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: 'app-nid-list',
  templateUrl: './nid-list.component.html',
  styleUrls: ['./nid-list.component.css']
})
export class NidListComponent implements OnInit {

  NIDs: Observable<Nid[]>;

  constructor(private nidService: NidService,private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.NIDs = this.nidService.getNidList();
  }

  deleteNid(id: number) {
    this.nidService.deleteNid(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

    public gotoNidUpload(url,id) {
    var myurl=`${url}/${id}`
    this.router.navigate([myurl]).then( (e) => {
      if (e) {
        console.log("Navigation is successful!");
      } else {
        console.log("Navigation has failed!");
      }
    });
  }
}