package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{

    private List<Observer> observers;
    private String operation;
    private String record;

    public Subject(){
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        System.out.println("Adding:"+observer);
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        System.out.println("Removing:"+observer);
        int i = observers.indexOf(observer);
        observers.remove(i);
    }

    @Override
    public void notifySubscriber() {
        for (Observer observer:observers){
            System.out.println("Informing Observer:"+observer);
            observer.update(operation,record);
        }
    }

    @Override
    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifySubscriber();
    }
}
