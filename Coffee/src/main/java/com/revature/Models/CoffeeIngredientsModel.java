package com.revature.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name="coffee_ingredients")
public class CoffeeIngredientsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String IngredientName;

    @Column
    String IngredientDetails;

    public CoffeeIngredientsModel(){};





}
