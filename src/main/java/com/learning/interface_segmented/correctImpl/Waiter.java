package com.learning.interface_segmented.correctImpl;

public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("serving the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }
}
