import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { AdminComponent } from './admin/admin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminlogoutComponent } from './adminlogout/adminlogout.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { ChangepassworduserComponent } from './changepassworduser/changepassworduser.component';
import { ListComponent } from './list/list.component';
import { OrderdetailsComponent } from './orderdetails/orderdetails.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { RemoveproductComponent } from './removeproduct/removeproduct.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { UserComponent } from './user/user.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { UserlogoutComponent } from './userlogout/userlogout.component';

const routes: Routes = [
  {"path":"admin",component:AdminComponent},
  {"path":"adash",component:AdmindashboardComponent},
  {"path":"adash/add",component:AddproductComponent},
  {"path":"adash/list",component:ListComponent},
  {"path":"adash/list/remove",component:RemoveproductComponent},
  {"path":"adash/pwd",component:ChangepasswordComponent},
  {"path":"adash/alogout",component:AdminlogoutComponent},
  {"path":"user",component:UserComponent},
  {"path":"udash",component:UserdashboardComponent},
  {"path":"udash/upwd",component:ChangepassworduserComponent},
  {"path":"udash/ulogout",component:UserlogoutComponent},
  {"path":"udash/search",component:SearchproductComponent},
  {"path":"udash/search/purc",component:PurchaseComponent},
  {"path":"udash/search/purc/order",component:OrderdetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }