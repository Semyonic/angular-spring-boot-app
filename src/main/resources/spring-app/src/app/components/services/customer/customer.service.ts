import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) {
  }

  public getCustomerById(id: number) {
    return this.http.get(`${environment.ENDPOINTS.Customers}/${id}`);
  }

  public createCustomer(data: object) {
    return this.http.post(`${environment.ENDPOINTS.Customers}`, data);
  }

  public updateCustomer(id: number, data: object) {
    return this.http.patch(`${environment.ENDPOINTS.Customers}/${id}`, data);
  }
}
