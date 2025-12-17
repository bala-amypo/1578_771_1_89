package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Email;
import java.time.LocalDateTime;

public class Vendor{
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(unique=true)
    private String vendorName;
    @Email
    private String contactEmail;
    private String address;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private LocalDateTime createdAt;

    public Vendor(){}
    public Vendor(String vendorName,String contactEmail,String address,LocalDateTime createdAt){
        this.vendorName=vendorName;
        this.contactEmail=contactEmail;
        this.address=address;
        this.createdAt=createdAt;
    }

    public long getId() {
        return id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt=createdAt;
    }
}