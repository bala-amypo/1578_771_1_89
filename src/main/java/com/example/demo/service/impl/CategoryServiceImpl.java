package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import com.example.demo.exception.ResourceNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Category createCategory(Category category){
       return categoryRepository.save(category);
    }
    @Override
    public Category getCategory(Long id){
      return categoryRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Category not found with id: "+id));
    }
    public List<Category> getAllCategories(){
       return categoryRepository.findAll();
    }
}