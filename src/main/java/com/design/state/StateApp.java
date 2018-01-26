package com.design.state;

public class StateApp {

    public static void main(String args[]){
        Context context = new Context();
        IState state = new StartState();
        state.doAction(context);
        System.out.println(state.toString());
        state = new StopState();
        state.doAction(context);
        System.out.println(state.toString());

    }

}
