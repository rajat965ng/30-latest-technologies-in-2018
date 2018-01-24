package com.design.strategy;

public class AirPlane extends Vehicle{

    public AirPlane() {
        setGoAlgorithm(new FlyingGoAlgorithm());
    }
}
