import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-searchproduct',
  templateUrl: './searchproduct.component.html',
  styleUrls: ['./searchproduct.component.css']
})
export class SearchproductComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private service: ProductService, private router:Router) { }

  searchForm: FormGroup;

  product:Product=new Product();
  pro:Product[];
  submitted: boolean = false;

  ngOnInit(): void {
    this.searchForm = this.formBuilder.group({
      name: ['', Validators.required]
    })
  }

  get f() {
    return this.searchForm.controls;
  }
  onSubmit() {
    this.submitted = true;

    if (this.searchForm.invalid)
      return;
    else {
      this.pro=this.service.search(this.product.name);
      console.log(this.pro);
    }
  }
  getf()
  {
    return this.searchForm.controls;
  }

  showpurchase(id: number)
  {
      this.service.purchase(id);
  }

}
