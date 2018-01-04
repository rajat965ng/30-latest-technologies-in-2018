package com.parallel.ctx;

public class DeadlockDemo {

    private static final String company1 = "IBM";
    private static final String company2 = "TCS";

    public static void main(String args[]){

        Thread t1 = new Thread(()->{
            synchronized (company1){
                System.out.println(company1);
                synchronized (company2){
                    System.out.println(company2);
                }
            }
        });


        Thread t2 = new Thread(()->{
            synchronized (company1){
                System.out.println(company2);
                synchronized (company2){
                    System.out.println(company1);
                }
            }
        });

        t1.start();t2.start();

    }

}
