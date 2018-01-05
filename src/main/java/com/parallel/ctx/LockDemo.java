package com.parallel.ctx;

import com.parallel.shared.Account;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ProducerThread implements Runnable{
    private Lock lock;
    private Account account;
    private Condition condition;
    public ProducerThread(Lock lock,Account account,Condition condition){
        this.lock = lock;
        this.account = account;
        this.condition = condition;
    }

    @Override
    public void run() {
        while (account.getAmount()!=10000){
            try{
                lock.lock();
                if (account.getAmount()>=9000){
                    System.out.println("Waiting for consumer to consume !!");
                }else {
                    account.increment();
                    System.out.println("Produce: "+account.getAmount());
                }
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

class ConsumerThread implements Runnable{
    private Lock lock;
    private Account account;
    private Condition condition;

    public ConsumerThread(Lock lock,Account account,Condition condition){
        this.lock = lock;
        this.account = account;
        this.condition = condition;
    }

    @Override
    public void run() {
        while (account.getAmount()!=10000){
            try{
                lock.lock();
                if (account.getAmount()<=2000){
                    System.out.println("Waiting for Producer to produce !!");
                }else {
                    account.decrement();
                    System.out.println("Consume: "+account.getAmount());
                }
                condition.signal();
            } finally {
                lock.unlock();
            }
        }
    }
}




public class LockDemo {

    public static void main(String args[]){
        Account account = new Account();
        Lock lock = new ReentrantLock(true);
        Condition condition = lock.newCondition();
        Thread producer = new Thread(new ProducerThread(lock,account,condition));
        Thread consumer = new Thread(new ConsumerThread(lock,account,condition));
        producer.start();
        consumer.start();
    }

}
