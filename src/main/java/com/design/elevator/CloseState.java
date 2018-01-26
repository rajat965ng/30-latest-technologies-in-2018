package com.design.elevator;

public class CloseState implements IElevatorState {

    @Override
    public void execute(Elevator elevator) {
        elevator.setCurrent(this);
        System.out.println("Elevator at floor:"+elevator.getIndex());
    }

    @Override
    public String toString() {
        return "Closing the elevator";
    }

}
