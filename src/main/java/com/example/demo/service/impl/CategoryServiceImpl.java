// package com.example.demo.service.impl;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.Category;
// import com.example.demo.repository.CategoryRepository;
// import com.example.demo.service.CategoryService;
// @Service
// public class CategoryServiceImpl implements CategoryService{
//     @Autowired
//     CategoryRepository categoryRepository;
//     @Override
//     public Category createCategory(Category category){
//        return categoryRepository.save(category);
//     }
//     @Override
//     public Category getCategory(Long id){
//        Optional<Category> optionalCategory=categoryRepository.findById(id);
//        return optionalCategory.orElse(other: null);
//     }
//     public List<Category> getAllCategories(){
//        return categoryRepository.findAll();
//     }
// }