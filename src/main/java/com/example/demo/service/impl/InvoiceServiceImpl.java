package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.service.InvoiceService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
        
    }
    @Override
    public Invoice categorizeInvoice(Long invoiceId){
       return userRepository.save(user);
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