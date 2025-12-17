package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
@Service
public class CategoryServiceImpl implements UseService{
    @Autowired
    UserRepository userRepository;
    @Override
    public Category createCategory(Category category){
       return userRepository.save(user);
    }
    @Override
    public Category getCategory(Long id){
       Optional<User> optionalUser=userRepository.findById(email);
       return optionalUser.orElse(other: null);
    }
    public List<Category> getAllCategories(){
       return userRepository.findAll();
    }
}