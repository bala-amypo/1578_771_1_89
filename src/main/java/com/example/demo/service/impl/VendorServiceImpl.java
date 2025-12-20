package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

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
      if(vendorRepository.existsByName(vendor.getVendorName())){
      throw new ResourceNotFoundException("Vendor name already exixts");
      }
      if(vendor.getContactEmail()==null || Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$",vendor.getContactEmail())){
         throw new IllegalArgumentException("Invalid contact email format");
      }
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