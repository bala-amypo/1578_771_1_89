Invoice uploadInvoice(Long userId,Long vendorId,Invoice invoice);
    Invoice categorizeInvoice(Long invoiceId);
    List<Invoice> getInvoicesByUser(Long userId);
    Invoice getInvoice(Long invoiceid);