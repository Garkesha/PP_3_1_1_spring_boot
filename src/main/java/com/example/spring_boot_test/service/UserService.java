package com.example.spring_boot_test.service;

import com.example.spring_boot_test.models.User;

import java.util.List;

public interface UserService {
    List<User> index();

    void save(User user);

    User findById(int id);

    void update(User updatedUser);

    void delete(int id);

}
