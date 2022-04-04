import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private router:Router) { }

  user= {"username":"user","password":"user123"}
  
  login(uname:string,password:string)
  {
      if(uname===this.user.username && password===this.user.password)
      {
        this.router.navigateByUrl('udash');
        return true;
      }
      else
      return false;
  }

  changeupwd(uname:string,password:string)
  {
    if(uname===this.user.username)
    {
      this.user.password=password;
      return true;
    }
    else
    return false;
  }
}
