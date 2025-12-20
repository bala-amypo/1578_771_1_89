package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Category;

@Service
public interface CategoryService{
    Category createCategory(Category category);
    Category getCategory(Long id);
    List<Category> getAllCategories();
}