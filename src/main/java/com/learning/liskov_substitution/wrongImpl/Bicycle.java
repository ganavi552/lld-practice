package com.learning.liskov_substitution.wrongImpl;

public class Bicycle implements Bike{

    //this not follows liskov substitution principle.
//    bcs whenever if we pass Bicycle obj to program which needs Bike obj . and in that program if we call turnOnEngine method then it throws exception
    // here we are reducing capabilities of parent class bike in child class Bicycle  and we shld not do that .

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {
// do something.
    }
}
