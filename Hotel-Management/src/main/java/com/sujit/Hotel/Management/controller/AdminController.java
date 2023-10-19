package com.sujit.Hotel.Management.controller;

import com.sujit.Hotel.Management.model.Dto.AuthInputDto;
import com.sujit.Hotel.Management.model.Dto.SignInInputDto;
import com.sujit.Hotel.Management.model.FoodItem;
import com.sujit.Hotel.Management.model.User;
import com.sujit.Hotel.Management.service.AdminService;
import com.sujit.Hotel.Management.service.FoodService;
import com.sujit.Hotel.Management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    FoodService foodService;

    @Autowired
    AdminService adminService;

    @Autowired
    UserService userService;

    @PostMapping("admin/signup")
    public String adminSignUp(@RequestBody User user)
    {
        return adminService.adminSignUp(user);
    }

    //sign in
    @PostMapping("admin/signIn")
    public String adminSignIn(@RequestBody SignInInputDto signInInput)
    {
        return adminService.adminSignIn(signInInput);
    }

    //sign out
    @DeleteMapping("admin/signOut")
    public String adminSignOut(@RequestBody AuthInputDto authInfo)
    {
        return adminService.adminSignOut(authInfo);
    }

    @GetMapping("admin/foods")
    public List<FoodItem> getFoods(){
        return foodService.getFoodItems();
    }

    @PostMapping("admin/foods")
    public String addFood(@RequestBody FoodItem food){
        return foodService.addFood(food);
    }

    @GetMapping("admin/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}

