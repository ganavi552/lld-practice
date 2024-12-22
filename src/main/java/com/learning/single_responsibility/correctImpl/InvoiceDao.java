package com.learning.single_responsibility.correctImpl;

public class InvoiceDao {
    Invoice invoice;
//this follows single responsibility principle.
//    it has one reason to change. that is saving invoice to db/ file.
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB(){
        //save into  to db
    }

}
