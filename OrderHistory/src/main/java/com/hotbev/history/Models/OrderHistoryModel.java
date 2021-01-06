package com.hotbev.history.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Table(name="order_history")
public class OrderHistoryModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    // id, drink, sessionID, Date

    //drink foreign key to


}
