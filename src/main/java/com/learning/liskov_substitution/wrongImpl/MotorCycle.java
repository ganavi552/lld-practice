package com.learning.liskov_substitution.wrongImpl;

public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    // motorcycle implements two methods present in Bike interface[parent class] and it not  narrows down any capability of parent
//    if any program uses Bike obj, and it calls any of its two methods in that prgm .then if we pass MotorCycle obj . it works .
//    bcs we are not reducing any capabilities of parent class.

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed+10;
    }
}
