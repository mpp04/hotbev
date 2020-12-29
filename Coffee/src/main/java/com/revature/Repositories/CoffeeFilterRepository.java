package com.revature.Repositories;

import com.revature.Models.CoffeeFilterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeFilterRepository extends JpaRepository<CoffeeFilterModel, Integer> {
}
