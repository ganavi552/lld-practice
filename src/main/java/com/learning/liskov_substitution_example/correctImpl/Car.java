package com.learning.liskov_substitution_example.correctImpl;

public class Car extends EngineVehicle{
    @Override
    public Integer getNumberOfWheel() {
        return 4;
    }
}
