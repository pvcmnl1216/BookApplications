/*
 * Author Name: Philip Meshach
 * Date: 16-01-2023
 * Praise The Lord
 */
package com.niit.BackendPractise.controller;

import com.niit.BackendPractise.domain.User;
import com.niit.BackendPractise.service.GenerateToken;
import com.niit.BackendPractise.service.GenerateTokenImpl;
import com.niit.BackendPractise.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class UserController {

    ServiceImpl service;
    GenerateTokenImpl generateToken;
    @Autowired
    public UserController(ServiceImpl service, GenerateTokenImpl generateToken) {
        this.service = service;
        this.generateToken = generateToken;
    }

    @PostMapping("/Register")
    public ResponseEntity<?>addUser(@RequestBody User user){
        return new ResponseEntity<>(service.addUser(user), HttpStatus.OK);
    }
    @GetMapping ("/User")
    public ResponseEntity<?>getAll(){
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<?>loginCheck(@RequestBody User user){
        User user1 = service.loginCheck(user.getUserName(),user.getEmail());
        if(user1!=null){
            Map<String ,String > map = generateToken.generateToken(user1);
            return new ResponseEntity<>(map,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("User Not Exist",HttpStatus.BAD_REQUEST);
        }
    }
}
