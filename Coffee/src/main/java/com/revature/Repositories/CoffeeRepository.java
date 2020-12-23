package com.revature.Repositories;


import com.revature.Models.CoffeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories("com.revature.Repositories")
public interface CoffeeRepository extends JpaRepository<CoffeeModel, Integer> {

}
