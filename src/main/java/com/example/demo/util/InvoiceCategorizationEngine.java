package com.example.demo.util;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.example.demo.model.Category;
import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Invoice;

@Component
public class InvoiceCategorizationEngine{
    public Category determineCategory(Invoice invoice,List<CategorizationRule> rules)
}