package com.design.singleton;

public class SingleTonApp {

    public static void main(String args[]){
        Database database = null;
        Thread threadOne = new Thread(()->{
            System.out.println(Database.getInstance("Product").getName());
        });

        Thread threadTwo = new Thread(()->{
            System.out.println(Database.getInstance("Design").getName());
        });

        threadOne.start();
        threadTwo.start();
    }

}
