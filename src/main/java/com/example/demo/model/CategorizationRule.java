package com.example.demo.model;

public class CategorizationRule{
    private long id;
    private String keyword;
    private String matchType;
    private int priority;

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