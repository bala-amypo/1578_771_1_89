package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Email;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Vendor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long vendorId;
    @Column(unique=true)
    private String vendorName;
    @Email
    private String contactEmail;
    private String address;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
    this.createdAt=LocalDateTime.now();
    }
    @ManyToMany(mappedBy="favouriteVendors")
    private List<User> users=new ArrayList<>();
    @OneToMany(mappedBy="vendor")
    @JsonIgnore
    private List<Invoice> invoices=new ArrayList<>();
    public Vendor(){}
    public Vendor(String vendorName,String contactEmail,String address,LocalDateTime createdAt){
        this.vendorName=vendorName;
        this.contactEmail=contactEmail;
        this.address=address;
        this.createdAt=createdAt;
    }

    public long getVendorId() {
        return vendorId;
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

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
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