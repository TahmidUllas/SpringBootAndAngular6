import { NidService } from './../nid.service';
import { nid } from './../nid';
import { DosUser } from './../user';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-nid',
  templateUrl: './create-nid.component.html',
  styleUrls: ['./create-nid.component.css']
})
export class CreateNidComponent implements OnInit {

  nidU: nid = new nid();
  submitted = false;

  constructor(private nidService: NidService) { }

  ngOnInit() {
  }

  newNid(): void {
    this.submitted = false;
    this.nidU = new nid();
  }

  save() {
    this.nidService.createNid(this.nidU)
      .subscribe(data => console.log(data), error => console.log(error));
    this.nidU = new nid();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }
}
