package com.kajal.user.service.controllers;

import com.kajal.user.service.entities.User;
import com.kajal.user.service.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    public ResponseEntity<User> createUser(@RequestBody User user){

    }
}
