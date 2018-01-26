package com.design.template;

public class AutomotiveRobot extends RobotTemplate{

    @Override
    public void getParts() {
        System.out.println("getting Carburetor..");
    }

    @Override
    public void assemble() {
        System.out.println("assembling Carburetor..");
    }

    @Override
    public void test() {
        System.out.println("Revving the engine..");
    }
}
