package com.learning.liskov_substitution_example.wrongImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        //if I create one more class that not supports engine then this code will be broken during run time.
        vehicleList.add(new Bicycle());// when we use Bicycle obj and call hasEngine method. then it gives NPE in runtime

        for(Vehicle vehicle :vehicleList) {
            System.out.println(vehicle.hasEngine().toString());
        }

        // soln is >> keep generic methods in parent class.
        // for ex : vehicle contains getNumberOfLWheels();
        // EngineVehicle extends vehicle >> this contains hasEngine()
        // Car, MotorCycle classes are child class of EngineVehicle.
        //Bicycle is child class of Vehicle.

    }
}
