package com.example.demo.repository;

import com.example.demo.model.CategorizationRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorizationRuleRepository
        extends JpaRepository<CategorizationRule, Long> {

    /**
     * Finds rules where invoice description contains rule description
     */
    List<CategorizationRule>
    findByDescriptionContainingIgnoreCase(String description);
}
