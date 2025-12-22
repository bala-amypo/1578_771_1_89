package com.example.demo.util;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.example.demo.model.Category;
import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Invoice;

@Component
public class InvoiceCategorizationEngine{
    public Category determineCategory(Invoice invoice,List<CategorizationRule> rules){
        if(invoice==null) || invoice.getDescription()==null){
            return null;
        }
        String description=invoice.getDescription().toLowerCase();
        for(CategorizationRule rule:rules){
            String keyword=rule.getKeyword().toLowerCase();
            switch(rule.getMatchType()){
                case EXACT:
                    if(description.equals(keyword)){
                        return rule.getCategory();
                    }
                    break;
                case CONTAINS:
                    if(description.contains(keyword)){
                        return rule.getCategory();
                    }
                    break;
                case REGEX:
                    try{
                        if(description.matches(keyword))
                    }
            }
        }
    }
}