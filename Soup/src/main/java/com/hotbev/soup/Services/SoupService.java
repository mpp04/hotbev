package com.hotbev.soup.Services;

import com.hotbev.soup.Models.SoupModel;
import com.hotbev.soup.Repositories.SoupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@EnableJpaRepositories
@Service
public class SoupService {
    @Autowired
    SoupRepository soupRepository;

 SoupService(){}


    public SoupModel newSoup(String name, String description) {

        System.out.println("SOUP SERVICE: name is" + name + " description is: " + description);
        SoupModel soup = new SoupModel(name, description);
        soupRepository.save(soup);
        //SoupModel soup2 = SoupRepository.save(soup);

        return soup;
    }


    public List getAllSoups() {

        List result = soupRepository.findAll();
        return result;
    }

    public String deleteSoup(Integer id) {

     soupRepository.deleteById(id);
     return "SoupService:: Soup entry has been deleted";
    }

}
