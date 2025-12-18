package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
@Entity
@Table(name="invoices",uniqueConstraints=@UniqueConstraint 
public class Invoice{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long invoiceId;
    @ManyToOne(optional=false)
    @JoinColumn(name="vendorId")
    private Vendor vendor;
    @Column(unique=true)
    private String invoiceNumber;
    @Positive
    private Double amount;
    private LocalDate invoiceDate;
    private String description;
    @Column(nullable=true)
    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category category;
    @ManyToOne
    @JoinColumn(name="uploadedBy")
    private User uploadedBy;
    private LocalDateTime uploadedAt;
    @PrePersist
    public void onCreate(){
      this.uploadedAt=LocalDateTime.now();
    }

    
    public Invoice(){}
    public Invoice(Vendor vendor,String invoiceNumber,Double amount,LocalDate invoiceDate,String description,Category category,User uploadedBy,LocalDateTime uploadedAt){
        this.vendor=vendor;
        this.invoiceNumber=invoiceNumber;
        this.amount=amount;
        this.invoiceDate=invoiceDate;
        this.description=description;
        this.category=category;
        this.uploadedBy=uploadedBy;
        this.uploadedAt=uploadedAt;
    }
    public long getInvoiceId(){
        return invoiceId;
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public Double getAmount() {
        return amount;
    }
    public String getDescription() {
        return description;
    }
    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}