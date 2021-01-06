package com.hotbev.soup.Controllers;

import com.hotbev.soup.Models.SoupModel;
import com.hotbev.soup.Repositories.SoupRepository;
import com.hotbev.soup.Services.SoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SoupController {
    @Autowired
    SoupService soupService;


    @Autowired
    SoupRepository soupRepository;


    @PostMapping(
            value = "/addSoup",
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> requestNewSoup(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam String recipe) {

        System.out.println("GetMapping: Parameter name is: " + name + " Parameter description is: " + description);

        soupService.newSoup(name, description, recipe);

        return ResponseEntity.ok("You have brewed delicious Soup!");
    }


    @GetMapping(
            value = "/getAllSoups",
            consumes = "application/x-www-form-urlencoded",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List getAllSoups() {  return soupService.getAllSoups(); }



    @PostMapping(
            value= "/deleteSoup",
            consumes = "application/x-www-form-urlencoded",
            produces =  MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String deleteSoup(
            @RequestParam Integer id) {
        soupService.deleteSoup(id);
        return "SoupController:: Soup entry successfully deleted";
    }



}
