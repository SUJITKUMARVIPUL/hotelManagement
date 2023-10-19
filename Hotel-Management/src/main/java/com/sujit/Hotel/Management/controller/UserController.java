package com.sujit.Hotel.Management.controller;

import com.sujit.Hotel.Management.model.Dto.AuthInputDto;
import com.sujit.Hotel.Management.model.Dto.OrderFoodDto;
import com.sujit.Hotel.Management.model.Dto.SignInInputDto;
import com.sujit.Hotel.Management.model.FoodItem;
import com.sujit.Hotel.Management.model.Order;
import com.sujit.Hotel.Management.model.User;
import com.sujit.Hotel.Management.service.FoodService;
import com.sujit.Hotel.Management.service.OrderService;
import com.sujit.Hotel.Management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    FoodService foodService;

    @Autowired
    OrderService orderService;

    @PostMapping("user/signup")
    public String userSignUp(@RequestBody User user)
    {
        return userService.userSignUp(user);
    }

    //sign in
    @PostMapping("user/signIn")
    public String userSignIn(@RequestBody SignInInputDto signInInput)
    {
        return userService.userSignIn(signInInput);
    }

    //sign out
    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestBody AuthInputDto authInfo)
    {
        return userService.userSignOut(authInfo);
    }

    @GetMapping("user/foods")
    public List<FoodItem> getFoods(){
        return foodService.getFoodItems();
    }

    @PostMapping("user/food/order/")
    public String orderFood(@RequestBody OrderFoodDto orderFoodDto)
    {
        return orderService.orderFood(orderFoodDto.getAuthInfo(),orderFoodDto.getOrder());
    }

    @PostMapping("user/orders")
    public List<Order> getOrders(@RequestBody AuthInputDto authInfo){
        return orderService.getOrders(authInfo);
    }
}

