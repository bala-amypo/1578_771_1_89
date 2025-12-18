package com.example.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Positive;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.example.demo.model.User;
import com.example.demo.model.Category;
@Entity
@Table(name="invoices")
// ,uniqueConstraints=@UniqueConstraint (columnNames={"vendorId","invoiceNumber"}))
public class Invoice{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long invoiceId;
    // @ManyToOne(optional=false)
    // @JoinColumn(name="vendorId")
    private Vendor vendor;
    @Column(unique=true,nullable=false)
    private String invoiceNumber;
    @Positive
    private Double amount;
    private LocalDate invoiceDate;
    private String description;
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
    public Vendor getVendor(){
    return vendor;
    }
    public void setVendor(Vendor vendor){
    this.vendor=vendor;
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
    public LocalDate getInvoiceDate(){
        return invoiceDate;
    }
    public Category getCategory(){
        return category;
    }
    public User getUploadedBy(){
        return uploadedBy;
    }
    public LocalDateTime getUploadedAt(){
        return uploadedAt;
    }
    public void setUploadedAt(LocalDateTime uploadedAt){
    this.uploadedAt=uploadedAt;
    }
    public void setUploadedBy(User uploadedBy){
        this.uploadedBy=uploadedBy;
    }
    public void setCategory(Category category){
        this.category=category;
    }
    public void setInvoiceDate(LocalDate invoiceDate){
        this.invoiceDate=invoiceDate;
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