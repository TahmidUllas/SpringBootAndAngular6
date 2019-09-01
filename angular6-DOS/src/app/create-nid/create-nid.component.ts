import { NidService } from './../nid.service';
import { Nid } from './../nid';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-nid',
  templateUrl: './create-nid.component.html',
  styleUrls: ['./create-nid.component.css']
})
export class CreateNidComponent implements OnInit {

  nidU: Nid = new Nid();
  submitted = false;

  constructor(private nidService: NidService) { }

  ngOnInit() {
  }

  newNid(): void {
    this.submitted = false;
    this.nidU = new Nid();
  }

  save() {
    this.nidService.createNid(this.nidU)
      .subscribe(data => console.log(data), error => console.log(error));
    this.nidU = new Nid();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

}
