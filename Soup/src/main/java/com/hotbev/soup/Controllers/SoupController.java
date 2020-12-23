package com.hotbev.soup.Controllers;

import com.hotbev.soup.Models.SoupModel;
import com.hotbev.soup.Repositories.SoupRepository;
import com.hotbev.soup.Services.SoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotbev")
public class SoupController {
    @Autowired
    private SoupService soupService;

    /*
    @Autowired

    SoupModel soupModel;

    @Autowired
    public SoupController(SoupModel sM) {
        this.soupModel = sM;
    }

    ResponseEntity.status(HttpStatus.OK)
                        .body("currentTime " + now + " application" + ":" + "OK");
produces = MediaType.APPLICATION_JSON_VALUE
  */
    @Autowired
    SoupRepository soupRepository;


    SoupModel newSoup;



    @GetMapping(value = "/new/soup", produces= MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> requestNewSoup(@RequestParam String name, @RequestParam String d) {
    System.out.println("POSTMAPPING: Parameter name is: " +name +" Parameter d is: " +d);
    soupService.newSoup(name, d);

   // newSoup = new soups(name, d);
   // soupRepository.save(newSoup);
    return ResponseEntity.ok("You have brewed delicious Soup!");
    }
}
