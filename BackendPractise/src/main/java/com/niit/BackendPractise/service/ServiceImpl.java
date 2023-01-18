/*
 * Author Name: Philip Meshach
 * Date: 16-01-2023
 * Praise The Lord
 */
package com.niit.BackendPractise.service;

import com.niit.BackendPractise.domain.User;
import com.niit.BackendPractise.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements UserService{
    @Autowired
    UserInterface userInterface;

    @Override
    public User addUser(User user) {
        if (userInterface.findById(user.getUserName()).isEmpty()){
            userInterface.save(user);
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userInterface.findAll();
    }

    @Override
    public User loginCheck(String userName, String email) {
        if (userInterface.findById(userName).isPresent()) {
            User user = userInterface.findById(userName).get();
            if (user.getEmail().equals(email)) {
                return user;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
