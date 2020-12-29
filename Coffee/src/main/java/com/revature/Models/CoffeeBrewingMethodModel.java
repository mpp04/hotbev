package com.revature.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name="coffee_brewing_method")
public class CoffeeBrewingMethodModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String MethodName;

    @Column
    String details;

    public CoffeeBrewingMethodModel(){};

}
