package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Category{
    @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(unique=true)
    private String categoryName;
    private String description;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy="category")
    @JsonIgnore
    private List<Invoice> invoices=new ArrayList<>();
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