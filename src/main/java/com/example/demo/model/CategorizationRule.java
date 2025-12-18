package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
@Entity
public class CategorizationRule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_Id",nullable=true)
    @JsonIgnore
    private Category category;
    @Column(nullable=false)
    private String keyword;
    private String matchType;
    private int priority;
    private LocalDateTime createdAt;
 
    public CategorizationRule(){}
    public CategorizationRule(String keyword,String matchType,int priority){
        this.keyword=keyword;
        this.matchType=matchType;
        this.priority=priority;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getId(){
        return id;
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