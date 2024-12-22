package com.learning.open_closed.correctImpl;

import com.learning.single_responsibility.correctImpl.Invoice;

public class FileInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        //save to file.
    }
}
