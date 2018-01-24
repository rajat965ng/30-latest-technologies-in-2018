package com.design.strategy;

public class AppVehicle {

    public static void main(String args[]){
        AirPlane airPlane = new AirPlane();
        airPlane.go();
        SedanCar sedanCar = new SedanCar();
        sedanCar.go();
    }

}
