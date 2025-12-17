// package com.example.demo.service.impl;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;
// @Service
// public class UserServiceImpl implements UserService{
//     @Autowired
//     UserRepository userRepository;
//     @Override
//     public User registerUser(User user){
//        return userRepository.save(user);
//     }
//     @Override
//     public User findByEmail(String email){
//        Optional<User> optionalUser=userRepository.findByEmail(email);
//        return optionalUser.orElse(other: null);
//     }
//     public List<User> getAllUsers(){
//        return userRepository.findAll();
//     }
// }