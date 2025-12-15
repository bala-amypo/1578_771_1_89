package com.example.demo.model;

public class Invoice{
    private long id;
    private String invoiceNumber;
    private double amount;
    private String description;
    
    public Invoice(long id,String invoiceNumber,double amount,String description){
        this.invoiceNumber=invoiceNumber;
        this.amount=amount;
        this.description=description;
    }
    public long getId(){
        return id;
    }
    public String getInvoiceNumber(){
        return invoiceNumber;
    }
    public double getAmount(){
        return amount;
    }
    public String getDescription(){
        return description;
    }
}