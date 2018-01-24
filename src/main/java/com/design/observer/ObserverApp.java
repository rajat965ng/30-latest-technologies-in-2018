package com.design.observer;

public class ObserverApp {

    public static void main(String args[]){
        ISubject subject = new Subject();
        Observer observer1 = new Observer(subject);
        Observer observer2 = new Observer(subject);
        subject.editRecord("Delete","Subject: NewsLetters");
    }

}
