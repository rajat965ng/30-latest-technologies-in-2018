package com.design.template;

public abstract class RobotTemplate {

    public final void go(){
        start();
        getParts();
        assemble();
        start();
        test();
        stop();
    }

    public void start(){
        System.out.println("Start Building Robot..");
    }
    public void getParts(){
        System.out.println("Getting Parts..");
    }
    public void assemble(){
        System.out.println("Assembling..");
    }
    public void test(){
        System.out.println("Testing..");
    }
    public void stop(){
        System.out.println("Stopping..");
    }

}
