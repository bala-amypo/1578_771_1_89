package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.IllegalArgumentException;
import com.example.demo.exception.ApiError;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;
    }
    @Override
    public User registerUser(User user) {
        if(userRepository.existsByEmail(user.getEmail())){
        throw new ResourceNotFoundException("Email already in use");
        }
        if(user.getPassword()==null || user.getPassword().length()< 8){
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        if(user.getRole()==null){
        user.setRole("USER");
        }
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