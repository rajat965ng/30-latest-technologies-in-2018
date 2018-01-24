package com.design.observer;

public interface ISubject {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifySubscriber();
    public void editRecord(String operation,String record);
}
