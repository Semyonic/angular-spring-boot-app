import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {
  }

  public getAllProducts() {
    return this.http.get(`${environment.ENDPOINTS.Products}`)
  }

  public getProductById(id: number) {
    return this.http.get(`${environment.ENDPOINTS.Products}/${id}`);
  }

  public createProduct(data: object) {
    return this.http.post(`${environment.ENDPOINTS.Products}`, data);
  }

  public updateProduct(id: number, data: object) {
    return this.http.patch(`${environment.ENDPOINTS.Products}/${id}`, data);
  }

  public deleteProduct(id: number) {
    return this.http.delete(`${environment.ENDPOINTS.Products}/${id}`);
  }
}
