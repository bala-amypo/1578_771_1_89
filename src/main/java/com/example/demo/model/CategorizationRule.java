package com.example.demo.model;

public class CategorizationRule{
    private long id;
    private String keyword;
    private String matchType;
    private int priority;

    public CategorizationRule(long id,String keyword,String matchType,int priority){
        this.id=id;
        this.keyword=keyword;
        this.matchType=matchType;
        this.priority=priority;
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