import { Component, OnInit } from '@angular/core';
import { Observable, share } from 'rxjs';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-orderdetails',
  templateUrl: './orderdetails.component.html',
  styleUrls: ['./orderdetails.component.css']
})
export class OrderdetailsComponent implements OnInit {

  public total: Observable<Number>;

  constructor(private service:ProductService) { 

    this.total=this.service.subject1.pipe(share());
  }

  ngOnInit(): void {
  }

}
