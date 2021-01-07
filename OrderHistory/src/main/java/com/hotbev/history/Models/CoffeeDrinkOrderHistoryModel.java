package com.hotbev.history.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="coffee_history")
public class CoffeeDrinkOrderHistoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;




}
