package com.design.state;

public class StartState implements IState {

    @Override
    public void doAction(Context context) {
        System.out.println("Start the system");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
