import {Component, OnInit} from '@angular/core';
import {Product} from "../models/Product/product";
import {ProductService} from "../components/services/product/product.service";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private service: ProductService) {  }

  public products: Product;

  ngOnInit() {
    this.service.getAllProducts().subscribe((response: Product) => {
      this.products = response;
    });
  }

}
