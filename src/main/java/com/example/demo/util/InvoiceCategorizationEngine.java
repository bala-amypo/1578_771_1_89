package com.example.demo.util;

import com.example.demo.model.*;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@Component
public class InvoiceCategorizationEngine {

    public Category determineCategory(
            Invoice invoice,
            List<CategorizationRule> rules) {

        return rules.stream()
                .sorted(Comparator.comparing(CategorizationRule::getPriority).reversed())
                .filter(rule ->
                        invoice.getDescription()
                                .toLowerCase()
                                .contains(rule.getKeyword().toLowerCase()))
                .map(CategorizationRule::getCategory)
                .findFirst()
                .orElse(null);
    }
}
