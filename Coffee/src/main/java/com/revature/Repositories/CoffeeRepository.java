package com.revature.Repositories;


import com.revature.Models.CoffeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories("com.revature.Repositories")
public interface CoffeeRepository extends JpaRepository<CoffeeModel, Integer> {

    @Override
    CoffeeModel getOne(Integer integer);




}
