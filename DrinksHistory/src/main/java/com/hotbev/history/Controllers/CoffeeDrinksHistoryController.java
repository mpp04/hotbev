package com.hotbev.history.Controllers;


import com.hotbev.history.Models.CoffeeDrinksHistoryModel;
import com.hotbev.history.Services.CoffeeDrinksHistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeDrinksHistoryController {

    @Autowired
    CoffeeDrinksHistoryServices coffeeDrinksHistoryServices;

    @RequestMapping(
            value = "/getCoffeeDrinksHistory",
            method = RequestMethod.GET,
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    List<CoffeeDrinksHistoryModel> getCoffeeDrinksHistory() {

        return coffeeDrinksHistoryServices.getCoffeeDrinksHistory();
    }



}
