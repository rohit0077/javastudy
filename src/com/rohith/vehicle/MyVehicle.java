package com.rohith.vehicle;

public class MyVehicle implements Vehicle{

    int numOfWheels;
    int seatingCapacity;

    public MyVehicle(int numOfWheels, int seatingCapacity){
        this.numOfWheels = numOfWheels;
        this.seatingCapacity = seatingCapacity;
    }

    public void drive(){
        System.out.println("I am driving");
    }

    public void info(){
        System.out.println("I have "+numOfWheels + " wheels");
        System.out.println("I can carry "+seatingCapacity+ " people");
    }



}
