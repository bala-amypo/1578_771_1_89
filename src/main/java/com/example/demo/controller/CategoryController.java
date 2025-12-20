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

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/categories")
public class CategoryController{
    @Autowired
    CategoryService categoryService;
    @PostMapping
    public ResponseEntity<Category> createAll(@Valid @RequestBody Category category){
        Category c=categoryService.createCategory(category);
        return ResponseEntity.status(201).body(c);
    }
    @GetMapping
    public List<Category>getAll(){
        return categoryService.getAllCategories();
    }
    @GetMapping("/{id}")
    public Category getById(@Valid @PathVariable Long id){
        return categoryService.getCategory(id);
    }
}