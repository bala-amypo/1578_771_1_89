package com.example.demo.repository;

import com.example.demo.model.CategorizationRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorizationRuleRepository
        extends JpaRepository<CategorizationRule, Long> {

    // ✅ EXACT NAME REQUIRED BY TEST
    List<CategorizationRule> findMatchingRulesByDescription(String description);
}
