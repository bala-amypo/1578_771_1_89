package com.example.demo.model;

public class Category{
    private long id;
    private String categoryName;
    private String description;

    public Category(long id,String categoryName,String description){
        this.id=id;
        this.categoryName=categoryName;
        this.description=description;
    }
    public long getId(){
        return id;
    }
    public String getCategoryName(){
        return categoryName;
    }
    public String getDescription(){
        return description;
    }
}