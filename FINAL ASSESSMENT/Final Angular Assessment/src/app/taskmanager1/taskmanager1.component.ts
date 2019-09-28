import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-taskmanager1',
  templateUrl: './taskmanager1.component.html',
  styleUrls: ['./taskmanager1.component.css']
})
export class Taskmanager1Component implements OnInit {
@Input() data:any='';
  constructor() { }

  ngOnInit() {
  }
  delete(user){
    this.data.splice(user)
  }
}
