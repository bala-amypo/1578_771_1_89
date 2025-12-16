package com.example.demo.model;

import java.time.LocalDateTime;
public class User{
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String fullName;
    @Column(unique=true)
    private String email;
    @Size(min=8)
    private String password;
    private String role;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private LocalDateTime createdAt;

    public User(){}
    public User(String fullName,String email,String password,String role){
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.role=role;
    }

    public long getId() {
        return id;
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

    public void setId(long id) {
        this.id = id;
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

    
}