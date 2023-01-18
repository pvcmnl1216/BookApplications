package com.niit.BackendPractise.service;

import com.niit.BackendPractise.domain.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    List<User> getAll();

    public User loginCheck(String userName,String email);
}
