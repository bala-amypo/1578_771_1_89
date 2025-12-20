package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.model.Invoice;
import com.example.demo.model.CategorizationRule;

@Entity
@Table(name="categories",uniqueConstraints=@UniqueConstraint (columnNames="categoryName"))
public class Category{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank
    @Column(unique=true)
    @Size(max=100)
    private String categoryName;
    @Size(max=500)
    private String description;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
    this.createdAt=LocalDateTime.now();
    }
    @OneToMany(mappedBy="category")
    @JsonIgnore
    private List<Invoice> invoices=new ArrayList<>();
    @OneToMany(mappedBy="category",cascade=CascadeType.ALL)
    @JsonIgnore
    private List<CategorizationRule> categorizationrule=new ArrayList<>();
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