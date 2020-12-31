package com.revature.controllers;

import com.revature.Coffee;
import com.revature.Models.CoffeeIngredientsModel;
import com.revature.Models.CoffeeVarietyModel;
import com.revature.Services.CoffeeDrinkService;
import org.h2.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

@RequestMapping("/CoffeeDrinks")
@RestController
public class CoffeeDrinkController {

    @Autowired
    CoffeeDrinkService coffeeDrinkService;


    @RequestMapping(
            value = "/getCoffeeDrinks",
            method = RequestMethod.GET,
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List getCoffeesDrinks() {

        return coffeeDrinkService.findAllCoffeeDrinks();

    }

    @RequestMapping(
            value = "/getAllCoffeeVarieties",
            method = RequestMethod.GET,
            consumes = "text/plain",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List getAllCoffeeVarieties() {
        return coffeeDrinkService.findAllCoffeeVarieties();
    }


    @RequestMapping(
            value = "/getAllCoffeeIngredients",
            method = RequestMethod.GET,
            consumes = "text/plain",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List getAllCoffeeIngredients() {
        return coffeeDrinkService.findAllCoffeeIngredients();
    }

    @RequestMapping(
            value ="/getAllCoffeeFilters",
            method = RequestMethod.GET,
            consumes = "text/plain",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List getAllCoffeeFilters() {
        return coffeeDrinkService.findAllCoffeeFilter(); }

    @RequestMapping(
            value ="/getAllCoffeeBrewingMethods",
            method = RequestMethod.GET,
            consumes = "text/plain",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List getAllCoffeeBrewingMethods() {
        return coffeeDrinkService.findAllCoffeeBrewingMethod(); }



    @RequestMapping(
            value = "/makeCoffeeDrink",
            method = RequestMethod.POST,
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String makeCoffeeDrink(
            @RequestParam String coffeeVariety,
            @RequestParam String coffeeIngredients,
            @RequestParam String coffeeFilter,
            @RequestParam String coffeeBrewingMethod,
            @RequestParam String coffeeDrinkName,
            @RequestParam String coffeeDrinkDescription

    ) {
        coffeeDrinkService.makeNewCoffeeDrink(coffeeVariety, coffeeIngredients, coffeeFilter,
                coffeeBrewingMethod, coffeeDrinkName, coffeeDrinkDescription);
        return "Successfully made another delightful addition to the library of Custom Coffee Drinks!";
    }

    @RequestMapping(
            value = "/addCoffeeVariety",
            method = RequestMethod.POST,
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CoffeeVarietyModel makeCoffeeVariety(@RequestParam String CoffeeVarietyName, @RequestParam String Details) {
        return coffeeDrinkService.makeNewVariety(CoffeeVarietyName, Details);
    }

    @RequestMapping(
            value = "/addCoffeeIngredient",
            method = RequestMethod.POST,
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CoffeeIngredientsModel addCoffeeIngredient(
            @RequestParam String IngredientName,
            @RequestParam String details) {

        return coffeeDrinkService.addCoffeeIngredient(IngredientName, details);}


    }



