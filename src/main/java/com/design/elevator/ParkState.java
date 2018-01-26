package com.design.elevator;

public class ParkState implements IElevatorState{

    @Override
    public void execute(Elevator elevator) {
        elevator.setCurrent(this);
        elevator.setIndex(0);
    }

    @Override
    public String toString() {
        return "Elevator is parked at Ground floor";
    }
}