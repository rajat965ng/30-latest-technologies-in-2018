package com.design.decorator;

public class MonitorDecorator extends PartsDecorator{

    public MonitorDecorator(IComputer part) {
        super(part);
    }

    @Override
    public String description() {
        return part.description()+" and Monitor";
    }
}
