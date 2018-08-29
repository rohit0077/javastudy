package com.rohith.vehicle;

public class Car extends MyVehicle {


    public Car(int numOfWheels, int seatingCapacity) {
        super(numOfWheels, seatingCapacity);
    }

    public void getBrand() {
        System.out.println("I am Maruti");
    }

}
