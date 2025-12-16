package com.example.demo.model;

public class Invoice{
    private long id;
    private Vendor vendor;
    private String invoiceNumber;
    private Double amount;
    private LocalDate invoiceDate;
    private String description;
    @Column(nullable=true)
    private Category category;
    private User uploadedBy;
    private LocalDateTime uploadedAt;
    
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
    public long getId(){
        return id;
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
    public void setId(long id) {
        this.id = id;
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