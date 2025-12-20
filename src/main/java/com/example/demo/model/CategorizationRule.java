package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.model.Category;

@Entity
@Table(name="categorization_rules")
public class CategorizationRule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ruleId;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="category_id",nullable=false)
    @JsonIgnore
    private Category category;
    @NotBlank
    @Size(max=500)
    private String keyword;
    @Enumerated(EnumType.STRING)
    @Column(name="match_type",nullable=false)
    private MatchType matchType;
    @Positive
    private int priority;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
      this.createdAt=LocalDateTime.now();
    }

    public CategorizationRule(){}
    public CategorizationRule(Category category,String keyword,String matchType,int priority){
        this.category=category;
        this.keyword=keyword;
        this.matchType=matchType;
        this.priority=priority;
    }
    public void setCategory(Category category){
        this.category=category;
    }
    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getRuleId(){
        return ruleId;
    }
    public Category getCategory(){
        return category;
    }
    public String getKeyword(){
        return keyword;
    }
    public String getMatchType(){
        return matchType;
    }
    public int getPriority(){
        return priority;
    }
}
enum MatchType{
    EXACT,
    CONTAINS,
    REGEX
}