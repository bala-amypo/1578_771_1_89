package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.demo.model.Invoice;
@Entity
@Table(name="vendors",uniqueConstraints={@UniqueConstraint (columnNames="vendorName"),@UniqueConstraint (columnNames="contact_email")})

public class Vendor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long vendorId;
    @NotBlank
    @Column(unique=true)
    @Size(max=150)
    private String vendorName;
    @Email
    @NotBlank
    @Size(max=100)
    private String contactEmail;
    @Size(max=500)
    private String address;
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
    this.createdAt=LocalDateTime.now();
    }
    @OneToMany(mappedBy="vendor")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Invoice> invoices;
    @ManyToMany(mappedBy="favoriteVendors")
    private List<User> favoritedByUsers;
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
    public List<Invoice> getInvoices(){
        return invoices;
    }
    public void setInvoices(List<Invoice> invoices){
        this.invoices=invoices;
    }
    public List<User> getFavoritedByUsers(){
        return favoritedByUsers;
    }
    public void setFavoritedByUsers(List<User> favoritedByUsers){
        this.favoritedByUsers=favoritedByUsers;
    }
}