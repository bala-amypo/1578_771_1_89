package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name="users")
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long userId;
    private String fullName;
    @Column(unique=true)
    private String email;
    @Size(min=8)
    private String password;
    private String role;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
    this.createdAt=LocalDateTime.now();
    }
    // @ManytoMany
    // @JoinTable(
    // name="user_vendor",
    // joinColumns=@JoinColumn(name="user_id"),
    // inverseJoinColumns=@JoinColumn(name="vendor_id")
    // )
    // private List<Vendor> vendors;
    public User(){}
    public User(String fullName,String email,String password,String role,LocalDateTime createdAt){
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.role=role;
        this.createdAt=createdAt;
    }

    public long getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
     public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt=createdAt;
    }
    
}