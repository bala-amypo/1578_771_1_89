package com.example.demo.model;

public class Category{
    private long id;
    private String categoryName;
    private String description;
 
    public Category(){}
    public Category(String categoryName,String description){
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
    public void setId(long id) {
        this.id = id;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}