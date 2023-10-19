package com.sujit.Hotel.Management.repo;


import com.sujit.Hotel.Management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
