package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Invoice;
import com.example.demo.service.InvoiceService;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController{
    @Autowired
    InvoiceService InvoiceService;
    @PostMapping("/")
    public ResponseEntity<Vendor> createAll(@RequestBody Vendor vendor){
        Vendor v=vendorService.createVendor(vendor);
        return ResponseEntity.status(201).body(v);
    }
    @GetMapping
    public List<Vendor>getAll(){
        return vendorService.getAllVendors();
    }
    @GetMapping("/{vendorId}")
    public ResponseEntity<Vendor> getById(@PathVariable Long vendorId){
        return vendorService.getVendor(vendorId);
    }
}