import { Injectable } from '@angular/core';
import { CoffeeModel } from "src/app/models/coffee-model.model";
import { Observable, throwError } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class CoffeeServiceService {
 
 
    headers= new HttpHeaders ({
      'Content-Type': 'application/json'
    });

    headersXForm = new HttpHeaders ({
      'Content-Type':'application/x-www-form-urlencoded'
    });


  CoffeesEndpoint: string = "http://0.0.0.0:8091/boot/Coffee";

  constructor(private httpClient: HttpClient) { }

  

    getCoffees(): Observable<CoffeeModel> {
      return this.httpClient.get<CoffeeModel>(this.CoffeesEndpoint + '/getCoffees', {'headers':this.headers});
  
      //return this.httpClient.get(this.CoffeesEndpoint);
 
    } 


addCoffees(name:string, description:string) {
  
  return this.httpClient.post<any>(this.CoffeesEndpoint + '/create?name='+name+'&description='+description, null,  
  {'headers': this.headersXForm})
}

}
