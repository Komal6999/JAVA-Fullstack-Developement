import { getQueryPredicate } from '@angular/compiler/src/render3/view/util';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, of } from 'rxjs';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products:Product[]=[];
  pro:Product[]=[];
  pro1:Product[]=[];
  public subject=new BehaviorSubject<Product[]>([]);
  public subject1=new BehaviorSubject<Number>(0);

  constructor(private router:Router) { }

  addProduct(product:any)
  {
    this.products.push(product);
  }
  getAllProducts():Product[]
  {
    return this.products;
  }
  deleteProduct(id: number)
  {
    this.products.splice(id,1);
  }
  search(name: String)
  {
    this.pro = this.getAllProducts().filter(x => x.name == name)
    return this.pro;
  }
  purchase(id: number)
  {
    this.pro1=this.getAllProducts().filter(y => y.id == id)
    this.subject.next(this.pro1);
  }
  orderdetails(price: number,n: number)
  {
    var t=price*n;
    this.subject1.next(t);
  }
  
}