package com.sujit.Hotel.Management.repo;

import com.sujit.Hotel.Management.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepo extends JpaRepository<FoodItem,Integer> {
}
