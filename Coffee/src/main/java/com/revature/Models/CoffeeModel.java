package com.revature.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="coffees")
public class CoffeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;


    public CoffeeModel(){}

    public CoffeeModel(String name, String description) {
        this.name=name;
        this.description=description;
    }



}
