package com.hotbev.tea.Models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "teas")
@Entity
public class TeaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column
    protected String description;

    public TeaModel(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public TeaModel() {
    }


}
