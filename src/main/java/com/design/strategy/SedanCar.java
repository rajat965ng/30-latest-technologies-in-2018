package com.design.strategy;

public class SedanCar extends Vehicle {

    public SedanCar() {

        setGoAlgorithm(new DriveGoAlgorithm());
    }
}
