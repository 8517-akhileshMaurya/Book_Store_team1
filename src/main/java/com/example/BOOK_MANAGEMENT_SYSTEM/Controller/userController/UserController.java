package com.example.BOOK_MANAGEMENT_SYSTEM.Controller.userController;

import com.example.BOOK_MANAGEMENT_SYSTEM.Service.userService.userService;
import com.example.BOOK_MANAGEMENT_SYSTEM.model.userModel.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private userService userService;

    @GetMapping("/user")
    public List<Users> getUser(){
        return userService.getUser();
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody Users users) {
        userService.registerUser(users);
        return "user added";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Users users) {
         userService.loginUser(users.getUsername(), users.getPassword());
         return "user login";
    }

}

