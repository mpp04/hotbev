package com.revature.Repositories;

import com.revature.Models.CoffeeVarietyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeVarietyRepository extends JpaRepository<CoffeeVarietyModel, Integer> {
}
