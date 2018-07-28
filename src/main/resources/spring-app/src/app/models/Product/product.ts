import {Category} from "../Category/category";

export class Product {
  public id: number;
  public barCode: string;
  public productCode: string;
  public name: string;
  public brand: string;
  public description: string;
  public price: number;
  public category: Category;
}
