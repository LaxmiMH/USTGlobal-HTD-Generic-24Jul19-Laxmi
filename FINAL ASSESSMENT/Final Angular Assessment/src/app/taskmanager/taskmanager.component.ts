import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-taskmanager',
  templateUrl: './taskmanager.component.html',
  styleUrls: ['./taskmanager.component.css']
})
export class TaskmanagerComponent implements OnInit {

  constructor() { }
added=[];
  ngOnInit() {
  }

   send(add:NgForm){
console.log(add.value);
this.added.push(add.value);
//this.added=add.value;

   }
   delete(data){
     this.added.splice(data,1);
   }
}
