package com.revature.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name="coffee_variety")
public class CoffeeVarietyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String CoffeeVarietyName;

    @Column
    String details;







}
