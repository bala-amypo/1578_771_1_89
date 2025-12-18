// package com.example.demo.service.impl;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.Vendor;
// import com.example.demo.repository.VendorRepository;
// import com.example.demo.service.VendorService;
// @Service
// public class VendorServiceImpl implements VendorService{
//     @Autowired
//     VendorRepository vendorRepository;
//     @Override
//     public Vendor createVendor(Vendor vendor){
//        return vendorRepository.save(vendor);
//     }
//     @Override
//     public Vendor getVendor(Long id){
//        Optional<Vendor> optionalVendor=vendorRepository.findById(id);
//        return optionalVendor.orElse(null);
//     }
//     public List<Vendor> getAllVendors(){
//        return vendorRepository.findAll();
//     }
// }