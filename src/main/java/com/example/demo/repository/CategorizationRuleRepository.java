package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.model.CategorizationRule;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CategorizationRuleRepository extends JpaRepository<CategorizationRule, Long> {
    // List<CategorizationRule> findByCategory_Id(Long categoryId);
     @Query(
        "SELECT r FROM CategorizationRule r " +
        "WHERE LOWER(:description) LIKE LOWER(CONCAT('%', r.keyword, '%')) " +
        "ORDER BY r.priority DESC"
    )
    List<CategorizationRule> findMatchingRulesByDescription(String description);
}