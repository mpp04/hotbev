package com.revature.Models;


import com.revature.Coffee;
import lombok.Getter;
import lombok.Setter;
import org.h2.util.json.JSONObject;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="coffee_drinks")
public class CoffeeDrinkModel {

 public CoffeeDrinkModel(){}



public CoffeeDrinkModel(
  String coffeeVariety,
  String coffeeIngredients,
  String coffeeFilter,
  String coffeeBrewingMethod,
  String coffeeDrinkName,
  String coffeeDrinkDescription) {

  this.coffeeVariety=coffeeVariety;
  this.coffeeIngredients=coffeeIngredients;
  this.coffeeFilter=coffeeFilter;
  this.coffeeBrewingMethod=coffeeBrewingMethod;
  this.coffeeDrinkName=coffeeDrinkName;
  this.coffeeDrinkDescription=coffeeDrinkDescription;
}



 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 Integer id;

    @Column(name="coffee_variety")
    String coffeeVariety;

    @Column(name="coffee_ingredients")
    String coffeeIngredients;

    @Column(name="coffee_filter")
    String coffeeFilter;

    @Column(name="coffee_brewing_method")
    String coffeeBrewingMethod;

    @Column(name="coffee_drink_name")
    String coffeeDrinkName;

    @Column(name="coffee_drink_description")
    String coffeeDrinkDescription;





}
