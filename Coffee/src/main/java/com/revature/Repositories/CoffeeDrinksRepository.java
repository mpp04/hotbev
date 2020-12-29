package com.revature.Repositories;

import com.revature.Models.CoffeeDrinkModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeDrinksRepository extends JpaRepository<CoffeeDrinkModel, Integer> {
}
