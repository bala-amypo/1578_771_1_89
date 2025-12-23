package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.demo.model.Invoice;
import com.example.demo.model.Vendor;

@Entity
@Table(name="users",uniqueConstraints=@UniqueConstraint (columnNames="email"))
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long userId;
    @NotBlank
    @Size(max=100)
    private String fullName;
    @Email
    @NotBlank
    @Column(unique=true)
    private String email;
    @NotBlank
    @Size(min=8)
    private String password;
    @NotBlank
    private String role="USER";
    private LocalDateTime createdAt;
    @PrePersist
    public void onCreate(){
    this.createdAt=LocalDateTime.now();
    if(this.role=="string") this.role="USER";
    }
    @OneToMany(mappedBy="uploadedBy")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private List<Invoice> invoices=new ArrayList<>();
    @ManyToMany
    @JoinTable(
    name="user_favorite_vendors",
    joinColumns=@JoinColumn(name="user_id"),
    inverseJoinColumns=@JoinColumn(name="vendor_id")
    )
    private List<Vendor> favoriteVendors;
    
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
    public List<Vendor> getFavoriteVendors(){
    return favoriteVendors;
    }
    public void setFavoriteVendors(){
    this.favoriteVendors=favoriteVendors;
    }
    public List<Invoice> getInvoices(){
    return invoices;
    }
    public void setInvoices(List<Invoice> invoices){
    this.invoices=invoices;
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