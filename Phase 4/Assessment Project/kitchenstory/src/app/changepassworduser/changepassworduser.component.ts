import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-changepassworduser',
  templateUrl: './changepassworduser.component.html',
  styleUrls: ['./changepassworduser.component.css']
})
export class ChangepassworduserComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: UserService, private router:Router) { }

  chgupwdForm: FormGroup;

  user:User=new User();
  a:boolean;
  submitted: boolean = false;

  ngOnInit(): void {
    this.chgupwdForm = this.formBuilder.group({
      uname: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  get f() {
    return this.chgupwdForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.chgupwdForm.invalid)
      return;
    else {
      this.a=this.service.changeupwd(this.user.username,this.user.password);
    }
  }
  getf()
  {
    return this.chgupwdForm.controls;
  }
}
