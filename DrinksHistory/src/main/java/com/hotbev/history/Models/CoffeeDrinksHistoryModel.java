package com.hotbev.history.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name="coffee_drinks_history_permanent")
public class CoffeeDrinksHistoryModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;

    @JoinColumn(name = "id_coffee_drink")
    @ManyToOne
    CoffeeDrinkModel coffeeDrink;




}
