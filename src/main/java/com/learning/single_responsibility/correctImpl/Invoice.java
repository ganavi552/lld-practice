package com.learning.single_responsibility.correctImpl;

import com.learning.single_responsibility.Marker;

public class Invoice {
    private Marker marker;
    private int quantity;

    // it follows single responsibility principle.
    // this has 1 reason to change.
    // like only when we want to change the implementation of calculate total price

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price =  quantity * marker.getPrice();
        return price;
    }

}
