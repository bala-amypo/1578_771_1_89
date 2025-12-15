package com.example.demo.model;

public class Vendor{
    private long id;
    private String vendorName;
    private String contactEmail;
    private String address;

    public Vendor(String vendorName,String contactEmail,String address){
        this.vendorName=vendorName;
        this.contactEmail=contactEmail;
        this.address=address;
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
    
}