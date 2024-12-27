package com.learning.liskov_substitution_example.wrongImpl;

public class Bicycle extends Car{
    @Override
    public Boolean hasEngine() {
        return null;
    }
}
