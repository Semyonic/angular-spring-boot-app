import {Component, Input, OnInit} from '@angular/core';
import { Product } from '../../models/Product/product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  @Input() productData: Product;
}
