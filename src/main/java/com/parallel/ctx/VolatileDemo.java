package com.parallel.ctx;

public class VolatileDemo {

    private static int counter = 0;
    private static boolean flag = true;


    public static void main(String args[]){

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName()+ " is working");
            for (int i=0;i<10&&flag;i++){
                counter++;
            }
            flag = !flag;
            System.out.println("The counter value is :"+counter);
            System.out.println(Thread.currentThread().getName()+ " is stopped");
        };

        Thread t1 = new Thread(runnable,"Thread 1");
        Thread t2 = new Thread(runnable,"Thread 2");
        Thread t3 = new Thread(runnable,"Thread 3");


        t1.start(); t2.start(); t3.start();

    }

}
