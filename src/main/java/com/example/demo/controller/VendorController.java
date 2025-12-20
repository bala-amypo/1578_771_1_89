package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
@RequestMapping("/auth/api/vendors")
public class VendorController{
    @Autowired
    VendorService vendorService;
    @PostMapping
    public ResponseEntity<Vendor> createAll(@Valid @RequestBody Vendor vendor){
        Vendor v=vendorService.createVendor(vendor);
        return ResponseEntity.status(201).body(v);
    }
    @GetMapping
    public List<Vendor>getAll(){
        return vendorService.getAllVendors();
    }
    @GetMapping("/{vendorId}")
    public Vendor getById(@Valid @PathVariable Long vendorId){
        return vendorService.getVendor(id);
    }
}