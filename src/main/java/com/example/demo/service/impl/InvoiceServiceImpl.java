package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.service.InvoiceService;
@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Autowired
    InvoiceRepository InvoiceRepository;
    @Override
    public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
       return InvoiceRepository.save(userId,vendorId,invoice);
    }
    @Override
    public Invoice categorizeInvoice(Long invoiceId){
       return InvoiceRepository.save(invoiceId);
    }
    @Override
    public List<Invoice> getInvoicesByUser(Long userId){
       Optional<User> optionalUser=userRepository.findById(email);
       return optionalUser.orElse(other: null);
    }
    public Invoice getInvoice(Long invoiceid);{
       return userRepository.findAll();
    }
}