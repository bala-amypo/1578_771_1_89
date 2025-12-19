package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.model.Vendor;
import com.example.demo.repository.VendorRepository;
import com.example.demo.service.InvoiceService;
import com.example.demo.exception.ResourceNotFoundException;

@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    VendorRepository vendorRepository;

    @Override
    public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
       User user=userRepository.findById(userId).orElseThrow(()->new Resourc
       Vendor vendor=vendorRepository.findById(vendorId).orElse(null);
       invoice.setUploadedBy(user);
       invoice.setVendor(vendor);
       return invoiceRepository.save(invoice);
    }
    @Override
    public Invoice categorizeInvoice(Long invoiceId){
       Invoice invoice=invoiceRepository.findById(invoiceId).orElse(null);  
       return invoiceRepository.save(invoice);
    }
    @Override
    public List<Invoice> getInvoicesByUser(Long userId){
       User user=userRepository.findById(userId).orElse(null);
       return invoiceRepository.findByUploadedBy(user);
    }
    @Override
    public Invoice getInvoice(Long invoiceId){
      return invoiceRepository.findById(invoiceId).orElse(null);
    }
} 