package com.kajal.user.service.services;

import com.kajal.user.service.entities.User;

import java.util.List;

public interface UserService {
    //User operations
    //create
    default User saveUser(User user) {
        return null;
    }

    //get all User
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);
    //

}
