package com.revature.Services;

import com.revature.Models.CoffeeModel;
import com.revature.Repositories.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;




@EnableJpaRepositories
@Service
public class CoffeeService {
    @Query(
            value = "update coffees set ?2 WHERE name = ?1",
            nativeQuery = true)
    void updateCoffeesByName(){};

    @Autowired
    CoffeeRepository coffeeRepository;


    CoffeeModel coffeeModel;

    CoffeeService() {
    }




    public CoffeeModel newCoffee(String name, String description) {

        System.out.println("Coffee SERVICE: name is" + name + " description is: " + description);
        CoffeeModel coffee = new CoffeeModel(name, description);
        coffeeRepository.save(coffee);
        //SoupModel soup2 = SoupRepository.save(soup);

        return coffee;

    }

    public List findAllCoffees() {
       List result = coffeeRepository.findAll();
       return result;
    }


    public void updateCoffeeEntry() {
       // coffeeRepository.findOne();

    }




}