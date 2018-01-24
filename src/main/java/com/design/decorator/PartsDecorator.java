package com.design.decorator;

public abstract class PartsDecorator implements IComputer{

    protected IComputer part;

    public PartsDecorator(IComputer part) {
        this.part = part;
    }


}
