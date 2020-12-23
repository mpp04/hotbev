package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import javax.print.attribute.standard.Media;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
//@RequestMapping("/healthcheck")
class HealthCheckController {

    @GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> healthcheck(@RequestParam String format) {
        switch (format) {
            case "short":
                return ResponseEntity.status(HttpStatus.OK)
                        .body("status" + ":" + "OK");

            case "full":
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                return ResponseEntity.status(HttpStatus.OK)
                        .body("currentTime " + now + " application" + ":" + "OK");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("BAD REQUEST");


    }





    @PutMapping(value="/tasks/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateTask(@RequestParam long id, @RequestParam String description) {

        return ResponseEntity.status(HttpStatus.OK)
                .body("THANKS ");

    }





    /** @PutMapping(value = "/healthcheck")
    public void healthcheckPut() {
        return;
    }

    @PostMapping(value = "/healthcheck")
    public void healthcheckPost() {
        return;
    }


    @DeleteMapping(value = "/healthcheck")
    public void healthcheckDelete() {
        return;
    } **/

}