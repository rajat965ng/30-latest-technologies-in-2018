package com.design.elevator;

public class Elevator {

    private IElevatorState current;
    private int index;


    public IElevatorState getCurrent() {
        return current;
    }

    public void setCurrent(IElevatorState current) {
        this.current = current;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
