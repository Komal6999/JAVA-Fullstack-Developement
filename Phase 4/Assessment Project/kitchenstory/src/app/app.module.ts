import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ListComponent } from './list/list.component';
import { RemoveproductComponent } from './removeproduct/removeproduct.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';
import { UserComponent } from './user/user.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { ChangepassworduserComponent } from './changepassworduser/changepassworduser.component';
import { SearchproductComponent } from './searchproduct/searchproduct.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { OrderdetailsComponent } from './orderdetails/orderdetails.component';
import { AdminlogoutComponent } from './adminlogout/adminlogout.component';
import { UserlogoutComponent } from './userlogout/userlogout.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AdmindashboardComponent,
    AddproductComponent,
    ListComponent,
    RemoveproductComponent,
    ChangepasswordComponent,
    UserComponent,
    UserdashboardComponent,
    ChangepassworduserComponent,
    SearchproductComponent,
    PurchaseComponent,
    OrderdetailsComponent,
    AdminlogoutComponent,
    UserlogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }