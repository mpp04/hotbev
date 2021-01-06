package com.hotbev.soup.Models;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "soups")
public class SoupModel {

    public SoupModel(String Name, String Description, String recipe) {
        System.out.println("MAKING NEW SOUP WITH Name= " + Name + " Description= " + Description);
        this.Name = Name;
        this.Description = Description;
        this.recipe = recipe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String Name;

    @Column
    String Description;

    @Column
    String recipe;

    public SoupModel() {

    }


}
