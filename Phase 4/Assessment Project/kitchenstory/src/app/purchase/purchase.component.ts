import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, share } from 'rxjs';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-purchase',
  templateUrl: './purchase.component.html',
  styleUrls: ['./purchase.component.css']
})
export class PurchaseComponent implements OnInit {

  public products: Observable<Product[]>;

  constructor(private service: ProductService, private router:Router) { 

    this.products=this.service.subject.pipe(share());
  }

  ngOnInit(): void {
  }

  tprice(price: number,n: number)
  {
    this.service.orderdetails(price,n);
    this.router.navigateByUrl('udash/search/purc/order');
  }

}
