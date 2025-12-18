package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import ord.springframework.web.bind.annotation.GetMapping;
import ord.springframework.web.bind.annotation.PathVariable;
import ord.springframework.web.bind.annotation.PostMapping;
import ord.springframework.web.bind.annotation.RequestBody;
import ord.springframework.web.bind.annotation.RequestMapping;
import ord.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import jakarta.validation.valid;
@RestController
@RequestMapping("/auth/api/users")
public class UserController{
    @Autowired
    UserService userService;
    @PostMapping
    public ResponseEntity<User> createAll(@Valid @R)
}