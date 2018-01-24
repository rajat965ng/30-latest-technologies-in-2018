package com.design.decorator;

public class DecoratorApp {

    public static void main(String args[]){
        IComputer computer = new MouseDecorator(new MonitorDecorator(new Computer()));
        System.out.println(computer.description());
        computer = new MonitorDecorator(computer);
        System.out.println(computer.description());
    }

}
