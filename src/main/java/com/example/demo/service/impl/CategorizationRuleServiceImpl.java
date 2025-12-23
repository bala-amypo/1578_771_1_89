package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Category;
import com.example.demo.repository.CategorizationRuleRepository;
import com.example.demo.service.CategorizationRuleService;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.exception.ResourceNotFoundException;

@Service
@Transactional
public class CategorizationRuleServiceImpl implements CategorizationRuleService{
    private CategorizationRuleRepository categorizationRuleRepository;
    private CategoryRepository categoryRepository;

    public CategorizationRuleServiceImpl(CategorizationRuleRepository categorizationRuleRepository,CategoryRepository categoryRepository){
       this.categorizationRuleRepository=categorizationRuleRepository;
       this.categoryRepository=categoryRepository;
    }

    @Override
    public CategorizationRule createRule(Long categoryId,CategorizationRule rule){
       Category category=categoryRepository.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category not found"));
       rule.setCategory(category);
       return categorizationRuleRepository.save(rule);
    }
    @Override
    public List<CategorizationRule> getRulesByCategory(Long categoryId) {
    return categorizationRuleRepository.findByCategory_Id(categoryId);
    }
    @Override
    public void deleteRule(Long ruleId){
        if(!categorizationRuleRepository.existsById(ruleId)){
            throw new ResourceNotFoundException("Rule not found");
        }
        else{
            categorizationRuleRepository.deleteById(ruleId);
        }
    }
}