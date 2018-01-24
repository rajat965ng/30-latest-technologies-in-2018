package com.design.observer;

public class Observer {

    public Observer(ISubject subject){
        subject.subscribe(this);
    }

    public void update(String operation, String record) {
        System.out.println("Operation performed: "+operation+", record: "+record);
    }
}
