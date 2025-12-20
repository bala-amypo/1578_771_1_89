// package com.example.demo.service.impl;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
 
// import com.example.demo.model.Invoice;
// import com.example.demo.repository.InvoiceRepository;
// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.model.Vendor;
// import com.example.demo.repository.VendorRepository;
// import com.example.demo.service.InvoiceService;
// import com.example.demo.exception.ResourceNotFoundException;

// @Service
// public class InvoiceServiceImpl implements InvoiceService{
//     @Autowired
//     InvoiceRepository invoiceRepository;
//     @Autowired
//     UserRepository userRepository;
//     @Autowired
//     VendorRepository vendorRepository;

//     @Override
//     public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
//        User user=userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found with id: "+ userId));
//        Vendor vendor=vendorRepository.findById(vendorId).orElseThrow(()->new ResourceNotFoundException("Vendor not found with id: "+ vendorId));
//        invoice.setUploadedBy(user);
//        invoice.setVendor(vendor);
//        return invoiceRepository.save(invoice);
//     }
//     @Override
//     public Invoice categorizeInvoice(Long invoiceId){
//        Invoice invoice=invoiceRepository.findById(invoiceId).orElseThrow(()->new ResourceNotFoundException("Invoice not found with id: "+ invoiceId));
//        return invoiceRepository.save(invoice);
//     }
//     @Override
//     public List<Invoice> getInvoicesByUser(Long userId){
//        User user=userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found with id: "+ userId));
//        return invoiceRepository.findByUploadedBy(user);
//     }
//     @Override
//     public Invoice getInvoice(Long invoiceId){
//       return invoiceRepository.findById(invoiceId).orElseThrow(()->new ResourceNotFoundException("Invoice not found with id: "+ invoiceId));
//     }
// } 