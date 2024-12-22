package com.learning.interface_segmented.wrongImpl;

public interface RestaurantEmployee {

    // this not follows interface segmented principle.
    //bcs all child classes[client]  not necessary to implement all 3 methods .
    //for ex : waiter class only serve customers he not washes or cook . so no need to implement those methods.
    // we have to break down interface into small.

    void washDishes();
    void serveCustomers();
    void cookFood();

}
