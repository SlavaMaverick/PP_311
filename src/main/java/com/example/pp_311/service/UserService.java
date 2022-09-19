package com.example.pp_311.service;

import com.example.pp_311.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUserById(Long id);

    void updateUserById(User user);

    void deleteUserById(Long id);

    List<User> getAllUsers();
}