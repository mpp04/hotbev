package com.hotbev.history.Services;

import com.hotbev.history.Models.CoffeeDrinksHistoryModel;
import com.hotbev.history.Repositories.CoffeeDrinksHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeDrinksHistoryServices {
   @Autowired
    CoffeeDrinksHistoryRepository coffeeDrinksHistoryRepository;

    public List<CoffeeDrinksHistoryModel> getCoffeeDrinksHistory() {
        return coffeeDrinksHistoryRepository.findAll();
    }





}
