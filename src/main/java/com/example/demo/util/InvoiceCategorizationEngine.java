package com.example.demo.util;

import com.example.demo.model.CategorizationRule;
import com.example.demo.model.Invoice;
import com.example.demo.repository.CategorizationRuleRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceCategorizationEngine {

    private final CategorizationRuleRepository ruleRepository;

    public InvoiceCategorizationEngine(CategorizationRuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    public void categorize(Invoice invoice) {

        if (invoice.getDescription() == null) {
            return;
        }

        String invoiceDesc = invoice.getDescription().toLowerCase();

        List<CategorizationRule> rules =
                ruleRepository.findByCategoryIdOrderByPriorityDesc(
                        invoice.getCategory().getId()
                );

        for (CategorizationRule rule : rules) {

            String keyword = rule.getKeyword().toLowerCase();

            if ("CONTAINS".equalsIgnoreCase(rule.getMatchType())
                    && invoiceDesc.contains(keyword)) {

                invoice.setCategory(rule.getCategory());
                return;
            }

            if ("EQUALS".equalsIgnoreCase(rule.getMatchType())
                    && invoiceDesc.equals(keyword)) {

                invoice.setCategory(rule.getCategory());
                return;
            }
        }
    }
}
