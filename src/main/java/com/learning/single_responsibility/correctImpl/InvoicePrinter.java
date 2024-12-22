package com.learning.single_responsibility.correctImpl;

public class InvoicePrinter {
    Invoice invoice;
//this follows single responsibility principle.
    //    it has one reason to change. if we want to change impl of print .
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print(){
        //print invoice
    }
}
