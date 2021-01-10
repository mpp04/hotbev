package com.hotbev.history.Repositories;


import com.hotbev.history.Models.CoffeeDrinksHistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeDrinksHistoryRepository extends JpaRepository<CoffeeDrinksHistoryModel, Integer> {
}
