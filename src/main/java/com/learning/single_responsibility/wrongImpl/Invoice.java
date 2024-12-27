package com.learning.single_responsibility.wrongImpl;

import com.learning.single_responsibility.Marker;

public class Invoice {
    private Marker marker;
    private int quantity;

//    single responsibily  -> A class should have 1 reason to change.
    //this class violates single responsibility. bcs this has more than two reasons to change.

    public Invoice(Marker marker, int price) {
        this.marker = marker;
        this.quantity = price;
    }

    public int calculateTotal(){
        // 1 reason : here we can change implementation  by adding  gst and discount in calculating price
        int price = marker.getPrice() * quantity;
        return price;
    }

    public void printInvoice(){
        // 2 reason :  we can change implementaion of printing invoice
        //print the invoice
    }

    public void saveToDB(){
        // 3 reason :  we  can save it to file as well.
        // save the data into DB
    }
}
