package com.design.facade;

public abstract class GenericFacade implements IStep{

    public abstract void moveRight();
    public abstract void moveLeft();
    public abstract void moveUp();
    public abstract void moveDown();

    public void plan(){
        moveLeft();
        moveUp();
        moveRight();
        moveDown();
    }

}
