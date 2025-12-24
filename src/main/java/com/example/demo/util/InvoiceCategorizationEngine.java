package com.example.demo.util;

import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Category;
import com.example.demo.model.Invoice;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceCategorizationEngine {

    /**
     * Determines category for an invoice based on rules
     */
    public Category determineCategory(
            Invoice invoice,
            List<CategorizationRule> rules) {

        if (invoice == null || rules == null || rules.isEmpty()) {
            return null;
        }

        String invoiceDesc = invoice.getDescription();
        if (invoiceDesc == null) {
            return null;
        }

        invoiceDesc = invoiceDesc.toLowerCase();

        for (CategorizationRule rule : rules) {

            String keyword = rule.getKeyword();
            if (keyword == null) continue;

            keyword = keyword.toLowerCase();

            if (invoiceDesc.contains(keyword)) {
                return rule.getCategory();
            }
        }

        return null; // no match
    }
}
