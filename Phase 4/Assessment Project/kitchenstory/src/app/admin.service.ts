import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private router:Router) { }

  admin= {"username":"admin","password":"admin123"}
  
  login(uname:string,password:string)
  {
      if(uname===this.admin.username && password===this.admin.password)
      {
        this.router.navigateByUrl('adash');
        return true;
      }
      else
      return false;
      
  }

  changepwd(uname:string,password:string)
  {
    if(uname===this.admin.username)
    {
      this.admin.password=password;
      return true;
    }
    else
    return false;
  }

}