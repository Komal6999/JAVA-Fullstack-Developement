import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../Admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: AdminService, private router:Router) { }

  loginForm: FormGroup;

  admin:Admin=new Admin();
  a:boolean;
  submitted: boolean = false;

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      uname: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  get f() {
    return this.loginForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.loginForm.invalid)
      return;
    else {
      this.a=this.service.login(this.admin.username,this.admin.password);
    }
  }
  getf()
  {
    return this.loginForm.controls;
  }
}
