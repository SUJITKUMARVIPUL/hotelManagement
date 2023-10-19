package com.sujit.Hotel.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "fk_food_id")
    FoodItem foodItem;

    private int qty;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    User user;

    private LocalDateTime dateTime;

    private Status status;
}
