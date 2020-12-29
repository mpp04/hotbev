package com.revature.Repositories;

import com.revature.Models.CoffeeIngredientsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeIngredientsRepository extends JpaRepository<CoffeeIngredientsModel, Integer> {
}
