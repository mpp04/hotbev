package com.revature.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="")
public class CoffeeDrinkModel {

CoffeeDrinkModel(
CoffeeVarietyModel cv,
List<CoffeeIngredientsModel> ci,
CoffeeFilterModel cf,
CoffeeBrewingMethodModel cfm,
String cfd) {

this.coffeeVarietyModel=cv;
this.coffeeIngredientsModel=ci;
this.coffeeFilterModel=cf;
this.coffeeBrewingMethodModel=cfm;
this.coffeeDrinkName=cfd; }



 CoffeeVarietyModel coffeeVarietyModel;

 List<CoffeeIngredientsModel> coffeeIngredientsModel;

 CoffeeFilterModel coffeeFilterModel;

 CoffeeBrewingMethodModel coffeeBrewingMethodModel;



 String coffeeDrinkName;

//WHAT DO YOU WANT ?
 /** What do we want to achieve:
  * We want to:
  * 1. Create a CoffeeDrinkModel as the sum of the Coffee Models: BrewingMethod, Filter, Ingredients and Variety
  * 2. Does JSON construction play a role?
  * 3. To persist CoffeeDrinks, it seems the CoffeeDrinks Data Base must be able to accommodate Objects directly. That
  * is, each column in the table that represents a CoffeeDrink, must be able to store an object value. Therefore, using
  * JSONs seems the way to do that.
  * 4. So, how and at what point do we convert into JSON each of the CoffeeDrink objects that act as its constructive
  * elements??
  */


}
