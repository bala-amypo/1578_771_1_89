package com.example.demo.model;

public class User{
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String role;

    public User(long id,String fullName,String email,String password,String role){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.role=role;
    }

    public long getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getRole(){
        return role;
    }
}