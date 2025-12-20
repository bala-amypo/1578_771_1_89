// package com.example.demo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.model.Invoice;
// import com.example.demo.service.InvoiceService;
// import jakarta.validation.Valid;
// @RestController
// @RequestMapping("/api/invoices")
// public class InvoiceController{
//     @Autowired
//     InvoiceService invoiceService;
//     @PostMapping("/upload/{userId}/{vendorId}")
//     public ResponseEntity<Invoice> uploadAll(@PathVariable Long userId,@PathVariable Long vendorId,@Valid @RequestBody Invoice invoice){
//         Invoice i=invoiceService.uploadInvoice(userId,vendorId,invoice);
//         return ResponseEntity.status(201).body(i);
//     }
//     @PostMapping("/categorize/{invoiceId}")
//     public ResponseEntity<Invoice> createAll(@PathVariable Long invoiceId){
//         Invoice i=invoiceService.categorizeInvoice(invoiceId);
//         return ResponseEntity.status(201).body(i);
//     }
//     @GetMapping("/user/{userId}")
//     public List<Invoice>getAll(@PathVariable Long userId){
//         return invoiceService.getInvoicesByUser(userId);
//     }
//     @GetMapping("/{invoiceId}")
//     public Invoice getById(@PathVariable Long invoiceId){
//         return invoiceService.getInvoice(invoiceId);
//     }
// } 