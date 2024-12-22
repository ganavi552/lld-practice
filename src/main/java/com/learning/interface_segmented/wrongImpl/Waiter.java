package com.learning.interface_segmented.wrongImpl;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not my job.
    }

    @Override
    public void serveCustomers() {
// yes and here is my impl
        System.out.println("serving the customers");
    }

    @Override
    public void cookFood() {
        //not my job.
    }
}
