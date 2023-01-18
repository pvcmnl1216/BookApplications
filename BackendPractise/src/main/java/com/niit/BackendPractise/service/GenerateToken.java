package com.niit.BackendPractise.service;

import com.niit.BackendPractise.domain.User;

import java.util.Map;

public interface GenerateToken {
    public Map<String,String> generateToken(User user);
}
