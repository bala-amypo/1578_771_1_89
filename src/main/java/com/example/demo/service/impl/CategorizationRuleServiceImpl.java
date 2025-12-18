package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Category;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.service.CategorizationRuleService;
import com.example.demo.repository.CategoryRepository;
@Service
public class CategorizationRuleServiceImpl implements CategorizationRuleService{
    @Autowired
    CategorizationRuleRepository categorizationRuleRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule){
       Category category=categoryRepostiory.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category Not found"));
       rule.setCategory(category);
       return categorizationRuleRepository.save(rule);
    }
    @Override
    public List<CategorizationRule> getRulesByCategory(Long categoryId){
       return categorizationRuleRepository.findByCategoryId(categoryId);
    }
    @Override
    public void deleteRule(Long ruleId){
        if(categorizationRuleRepository.existsById(ruleId)){
            categorizationRuleRepository.deleteById(ruleId);
        }
    }
}