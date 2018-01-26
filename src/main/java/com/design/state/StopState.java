package com.design.state;

public class StopState implements IState{

    @Override
    public void doAction(Context context) {
        System.out.println("Stop the system");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
