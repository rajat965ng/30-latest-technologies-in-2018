package com.design.elevator;

public class UpState implements IElevatorState{

    private int inputFloor;

    public UpState(int inputFloor) {
        this.inputFloor = inputFloor;
    }

    @Override
    public void execute(Elevator elevator) {
        if (elevator.getIndex()==15){
            System.out.println("Already at top floor.");
            return;
        }
        if (elevator.getIndex()==inputFloor){
            System.out.println("Lift at floor number:"+inputFloor);
            return;
        }
        elevator.setCurrent(this);
        elevator.setIndex(elevator.getIndex()+1);
        System.out.println("Current floor is:"+elevator.getIndex());
        execute(elevator);
    }

    @Override
    public String toString() {
        return "Going Up..";
    }
}
