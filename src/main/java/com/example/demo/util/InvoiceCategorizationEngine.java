package com.example.demo.util;

import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Category;
import com.example.demo.model.Invoice;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class InvoiceCategorizationEngine {

    /**
     * Determines the category of an invoice based on the given rules.
     *
     * @param invoice The invoice to categorize
     * @param rules List of all categorization rules
     * @return Category that matches the highest-priority rule, or null if no match
     */
    public Category determineCategory(Invoice invoice, List<CategorizationRule> rules) {

        if (invoice.getDescription() == null || rules == null) {
            return null;
        }

        // Sort rules by priority descending
        rules.sort(Comparator.comparing(CategorizationRule::getPriority).reversed());

        String description = invoice.getDescription().toLowerCase();

        for (CategorizationRule rule : rules) {
            String keyword = rule.getKeyword().toLowerCase();
            String matchType = rule.getMatchType();

            switch (matchType) {
                case "EXACT":
                    if (description.equals(keyword)) {
                        return rule.getCategory();
                    }
                    break;

                case "CONTAINS":
                    if (description.contains(keyword)) {
                        return rule.getCategory();
                    }
                    break;

                case "REGEX":
                    if (Pattern.compile(rule.getKeyword(), Pattern.CASE_INSENSITIVE)
                            .matcher(invoice.getDescription())
                            .find()) {
                        return rule.getCategory();
                    }
                    break;

                default:
                    break;
            }
        }

        // No matching rule found
        return null;
    }
}
