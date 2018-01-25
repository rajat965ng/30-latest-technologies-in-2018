package com.design.facade;

public class FacadeApp {

    public static void main(String args[]){
        StepImpl step = new StepImpl();
        step.drawCircle();
        step.drawRectangle();
        step.drawSquare();
    }

}
