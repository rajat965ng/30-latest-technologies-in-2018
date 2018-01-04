package com.parallel.ctx;


public class JoinDemo {


    public static void main(String args[]){

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is working");
            for (int i=0;i<10;i++){
                System.out.println(i);
            }

            System.out.println("Thread 1 is stopped");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 is working");
            for (int i=0;i<10;i++){
                System.out.println(i);
            }

            System.out.println("Thread 2 is stopped");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 is working");
            for (int i=0;i<10;i++){
                System.out.println(i);
            }

            System.out.println("Thread 3 is stopped");
        });

        t1.start();

        try {
            t1.join();
            t2.start();t3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
