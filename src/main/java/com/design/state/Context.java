package com.design.state;

public class Context {

    private IState state;

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
