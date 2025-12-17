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

import com.example.demo.model.Vendor;
import com.example.demo.service.VendorService;

@RestController
@RequestMapping("/api")
public class VendorController{
    @Autowired
    VendorService vendorService;

    @GetMapping("/vendors")
    public List<Vendor>getAll(){
        return vendorService.getAllVendors();
    }
    @PostMapping
    public ResponseEntity<Vendor> createAll(@RequestBody Vendor vendor){
        Vendor
    }
}