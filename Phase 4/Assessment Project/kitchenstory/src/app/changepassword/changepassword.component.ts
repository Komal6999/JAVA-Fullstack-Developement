import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from '../Admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: AdminService, private router:Router) { }

  chgpwdForm: FormGroup;

  admin:Admin=new Admin();
  a:boolean;
  submitted: boolean = false;

  ngOnInit(): void {
    this.chgpwdForm = this.formBuilder.group({
      uname: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  get f() {
    return this.chgpwdForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.chgpwdForm.invalid)
      return;
    else {
      this.a=this.service.changepwd(this.admin.username,this.admin.password);
    }
  }
  getf()
  {
    return this.chgpwdForm.controls;
  }

}
