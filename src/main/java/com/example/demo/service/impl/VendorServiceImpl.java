package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.VendorService;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.IllegalArgumentException;

@Service
@Transactional
public class VendorServiceImpl implements VendorService{
   private VendorRepository vendorRepository;
   public VendorServiceImpl(VendorRepository vendorRepository){
        this.vendorRepository=vendorRepository;
   }
    @Override
    public Vendor createVendor(Vendor vendor){
       return vendorRepository.save(vendor);
    }
    @Override
    public Vendor getVendor(Long vendorId){
       return vendorRepository.findById(vendorId).orElseThrow(()->new ResourceNotFoundException("Vendor not found with id: "+ vendorId));
    }
    public List<Vendor> getAllVendors(){
       return vendorRepository.findAll();
    }
}