package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/Coffee")
public class CoffeeController {

    @GetMapping
    public ResponseEntity<String> helloCoffee() {
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello World! This is Coffee!");
    }

    // the following link hits this mapping
    //http://localhost:8090/boot/Coffee/Coffee2?fooid=HOT&name=Brasilian
    // you need & to attach!!! the current param to the preceding one

    @RequestMapping(value = "/Coffee2", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @ResponseBody
    public String addFoo(@RequestParam String fooid, @RequestParam String name) {
        return "FOIDID IS " + fooid + " SECOND REQUEST PARAMETER name is " + name;

        // public ResponseEntity<String> helloCoffee2 () {
        //return ResponseEntity.status(HttpStatus.OK).body("You hit me!");
    }
}
