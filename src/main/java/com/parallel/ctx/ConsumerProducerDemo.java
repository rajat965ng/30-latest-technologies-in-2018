package com.parallel.ctx;

class Account{
    private Integer amount = 1000;

    public void increment(){
        amount+=2000;
    }
    public void decrement(){
        amount-=1000;
    }

    public Integer getAmount() {
        return amount;
    }

}

class Producer implements Runnable{
    private Account account;

    public Producer(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account){
            for(int i=0;i<10;i++){
                if (account.getAmount()>10000){
                    System.out.println("waiting for consumer to consume !!");
                    try {
                        account.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    account.increment();
                    System.out.println("Producing :" + account.getAmount());
                    account.notifyAll();
                }
            }
        }
    }
}

class Consumer implements Runnable{
    private Account account;

    public Consumer(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account){
            for(int i=0;i<10;i++){
                if (account.getAmount()<=2000){
                    System.out.println("waiting for Producer to produce !!");
                    try {
                        account.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    account.decrement();
                    System.out.println("Consumer :"+account.getAmount());
                    account.notifyAll();
                }
            }
        }
    }
}

public class ConsumerProducerDemo {

    public static void main(String args[]){

        final Account account = new Account();
        Thread t1 = new Thread(new Producer(account));
        Thread t2 = new Thread(new Consumer(account));

        t1.start();
        t2.start();
    }

}
