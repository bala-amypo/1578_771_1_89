package com.example.demo.repository;

import com.example.demo.model.CategorizationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategorizationRuleRepository extends JpaRepository<CategorizationRule, Long> {

    // Test-case exact method name
    List<CategorizationRule> findMatchingRulesByDescription(String description);
    List<CategorizationRule> findByCategoryIdOrderByPriorityDesc(Long categoryId);
}
