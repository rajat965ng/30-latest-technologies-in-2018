package com.design.decorator;

public class MouseDecorator extends PartsDecorator {

    public MouseDecorator(IComputer part) {
        super(part);
    }

    @Override
    public String description() {
        return part.description()+" and Mouse";
    }
}

