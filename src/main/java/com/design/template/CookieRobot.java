package com.design.template;

public class CookieRobot extends RobotTemplate{

    @Override
    public void getParts() {
        System.out.println("Getting flour and Sugar..");
    }

    @Override
    public void assemble() {
        System.out.println("Baking a cookie..");
    }

    @Override
    public void test() {
        System.out.println("Crunching a cookie..");
    }
}
