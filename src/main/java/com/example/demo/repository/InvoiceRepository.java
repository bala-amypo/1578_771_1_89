package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
import java.util.List;
import com.example.demo.model.Invoice;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long>{
    List<Invoice> findByUploadedBy(User user);
    @Query("SELECT i FROM Invoice i WHERE i.amount> :amount")
    List<Invoice> findByAmountGreaterThanHql(Double amount);
} 