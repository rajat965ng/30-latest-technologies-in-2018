package com.design.elevator;

public class DownState implements IElevatorState{

    private int inputFloor;

    public DownState(int inputFloor) {
        this.inputFloor = inputFloor;
    }

    @Override
    public void execute(Elevator elevator) {
        if (elevator.getIndex()==0){
            System.out.println("Already at Ground floor.");
            return;
        }
        if (elevator.getIndex()==inputFloor){
            System.out.println("Lift at floor number:"+inputFloor);
            return;
        }
        elevator.setCurrent(this);
        elevator.setIndex(elevator.getIndex()-1);
        System.out.println("Current floor is:"+elevator.getIndex());
        execute(elevator);
    }

    @Override
    public String toString() {
        return "Going Down..";
    }
}
