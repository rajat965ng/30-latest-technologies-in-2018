package com.design.facade;

public class FacadeApp {

    public static void main(String args[]){
        IStep iStep = new StepImpl();
        iStep.plan();
    }

}
