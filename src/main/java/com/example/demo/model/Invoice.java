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

    
    public Invoice(){}
    public Invoice(String invoiceNumber,double amount,String description){
        this.invoiceNumber=invoiceNumber;
        this.amount=amount;
        this.description=description;
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