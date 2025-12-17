package com.example.demo.model;

public class Category{
    private long id;
    private String categoryName;
    private String description;
    private LocalDateTime createdAt;
 
    public Category(){}
    public Category(String categoryName,String description,LocalDateTime createdAt){
        this.categoryName=categoryName;
        this.description=description;
        this.createdAt=createdAt;
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
    public LocalDateTime getCreatedAt(){
        return createdAt;
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
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
}