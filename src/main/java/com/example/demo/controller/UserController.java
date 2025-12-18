package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/auth/api/users")
public class UserController{
    @Autowired
    UserService userService;
    @PostMapping
    public ResponseEntity<User> createAll(@Valid @RequestBody User user){
        User st=userService.registerUser(user);
        return ResponseEntity.status(201).body(st);
    }
    @GetMapping
    public List<User> getAll(){
        return userService.getAllUsers();
    }
    @GetMapping("/{email}")
    public User getById(@Valid @PathVariable String email){
        return userService.findByEmail(email);
    }
}