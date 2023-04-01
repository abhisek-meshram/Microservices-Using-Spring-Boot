package com.learn.user.service.services;

import com.learn.user.service.entities.User;

import java.util.List;

public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all User
    List<User> getAllUsers();

    //get single user of given userId

    User getUser(String userId);

    //TODO: delete
    //TODO: update
}
