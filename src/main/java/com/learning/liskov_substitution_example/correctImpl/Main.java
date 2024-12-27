package com.learning.liskov_substitution_example.correctImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        case1: it not throws any compile time or runtime
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());// when we use Bicycle obj and call hasEngine method. then it gives NPE in runtime

        for(Vehicle vehicle :vehicleList) {
            System.out.println(vehicle.getNumberOfWheel().toString());
        }

//        case2:
        List<Vehicle> vehicleList1 = new ArrayList<>();
        vehicleList1.add(new MotorCycle());
        vehicleList1.add(new Car());
        vehicleList1.add(new Bicycle());// when we use Bicycle obj and call hasEngine method. then it gives NPE in runtime

        for(Vehicle vehicle :vehicleList1) {
//            System.out.println(vehicle.hasEngine().toString());// it gives Compile time issue
        }

        //case3:
        List<EngineVehicle> vehicleList2 = new ArrayList<>();
        vehicleList2.add(new MotorCycle());
        vehicleList2.add(new Car());
        vehicleList2.add(new Bicycle());//Compile time exception. it not breaks during run time

        for(EngineVehicle engineVehicle :vehicleList2) {
            System.out.println(engineVehicle.hasEngine().toString());// it gives Compile time issue
        }


    }
}
