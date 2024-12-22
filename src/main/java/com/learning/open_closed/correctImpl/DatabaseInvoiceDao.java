package com.learning.open_closed.correctImpl;

import com.learning.single_responsibility.correctImpl.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        //save to db.
    }
}
