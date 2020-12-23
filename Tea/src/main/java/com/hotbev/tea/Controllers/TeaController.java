package com.hotbev.tea.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class TeaController {

    @RequestMapping(value = "/tea", method = RequestMethod.GET, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String teaTest(@RequestParam String tea, @RequestParam String description) {
        return "Tea Name " + tea + " Description " + description;

        // public ResponseEntity<String> helloCoffee2 () {
        //return ResponseEntity.status(HttpStatus.OK).body("You hit me!");
    }


}
