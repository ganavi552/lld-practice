package com.learning.liskov_substitution_example.wrongImpl;

public class Car extends Vehicle{
    @Override
    public Integer getNumberOfWheel() {
        return 4;
    }

}
