// package com.example.demo.service.impl;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.demo.model.Invoice;
// import com.example.demo.repository.InvoiceRepository;
// import com.example.demo.service.InvoiceService;
// @Service
// public class InvoiceServiceImpl implements InvoiceService{
//     @Autowired
//     InvoiceRepository invoiceRepository;
//     @Override
//     public Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice){
       
//     }
//     @Override
//     public Invoice categorizeInvoice(Long invoiceId){
//        Invoice invoice=invoiceRepository.findById(invoiceId);
//        return invoiceRepository.save(invoice);
//     }
//     @Override
//     public List<Invoice> getInvoicesByUser(Long userId){
//        return invoiceRepository.findById(userId);
//     }
//     public Invoice getInvoice(Long invoiceId);{
//        Optional<Invoice> optionalInvoice=invoiceRepository.findById(invoiceId);
//        return optionalInvoice.orElse(other: null);
//     }
// }