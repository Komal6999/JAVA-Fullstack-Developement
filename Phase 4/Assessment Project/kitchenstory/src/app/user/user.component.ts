import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: UserService, private router:Router) { }

  uloginForm: FormGroup;

  user:User=new User();
  a:boolean;
  submitted: boolean = false;
  
  ngOnInit(): void {
    this.uloginForm = this.formBuilder.group({
      uname: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  get f() {
    return this.uloginForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.uloginForm.invalid)
      return;
    else {
      this.a=this.service.login(this.user.username,this.user.password);
    }
  }
  getf()
  {
    return this.uloginForm.controls;
  }

}
