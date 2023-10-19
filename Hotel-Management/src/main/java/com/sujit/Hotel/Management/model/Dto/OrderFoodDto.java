package com.sujit.Hotel.Management.model.Dto;

import com.sujit.Hotel.Management.model.Order;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderFoodDto {
    AuthInputDto authInfo;
    Order order;
}
