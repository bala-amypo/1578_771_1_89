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
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService{
    private InvoiceRepository invoiceRepository;
    private UserRepository userRepository;
    private VendorRepository vendorRepository;
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository,UserRepository userRepository,VendorRepository vendorRepository){
        this.invoiceRepository=invoiceRepository;
        this.userRepository=userRepository;
        this.vendorRepository=vendorRepository;
    }

    @Override
    public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
       User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found"));
       Vendor vendor=vendorRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Vendor not found"));
       
       invoice.setUploadedBy(user);
       invoice.setVendor(vendor);
       return invoiceRepository.save(invoice);
    }
    @Override
    public Invoice categorizeInvoice(Long invoiceId){
       Invoice invoice=invoiceRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Invoice not found"));
       return invoiceRepository.save(invoice);
    }
    @Override
    public List<Invoice> getInvoicesByUser(Long userId){
       User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found"));
       return invoiceRepository.findByUploadedBy(user);
    }
    @Override
    public Invoice getInvoice(Long invoiceId){
      return invoiceRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Invoice not found"));
    }
} 