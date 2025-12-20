package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.exception.ResourceNotFoundException;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public User findByEmail(String email){
       return userRepository.findByEmail(email).orElseThrow(()-> new ResourceNotFoundException("User not found"));
    }
    @Override
    public List<User> getAllUsers(){
       return userRepository.findAll();
    }
}