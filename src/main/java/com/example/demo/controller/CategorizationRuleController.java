package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CategorizationRule;
import com.example.demo.service.CategorizationRuleService;

@RestController
@RequestMapping("/api/rules")
public class CategorizationRuleController{
    @Autowired
    CategorizationRuleService categorizationRuleService;
    @PostMapping("/category/{categoryId}")
    public ResponseEntity<CategorizationRule> createAll(@RequestBody Long categoryId,CategorizationRule rule){
        CategorizationRule c=categorizationRuleService.createRule(categoryId,rule);
        return ResponseEntity.status(201).body(c);
    }
    @GetMapping("/category/{categoryId}")
    public List<CategorizationRule>getAll(){
        return categorizationRuleService.getAllVendors();
    }
    @DeleteMapping("/{ruleId}")
    public ResponseEntity<CategorizationRule> getById(@PathVariable Long vendorId){
        return categorizationRuleService.getVendor(vendorId);
    }
}