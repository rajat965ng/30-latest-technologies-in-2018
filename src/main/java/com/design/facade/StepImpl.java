package com.design.facade;

public class StepImpl extends GenericFacade {

    @Override
    public void moveRight() {
        System.out.println("Move Right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Move Left");

    }

    @Override
    public void moveUp() {
        System.out.println("Move Up");

    }

    @Override
    public void moveDown() {
        System.out.println("Move Down");

    }
}
