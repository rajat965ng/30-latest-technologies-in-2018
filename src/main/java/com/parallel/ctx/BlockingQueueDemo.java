package com.parallel.ctx;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class QueueProducer implements Runnable{

    private Queue<Integer> queue;

    public QueueProducer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            if (queue.isEmpty()) {
                queue.add(i+1);
                System.out.println("Producing: "+(i+1));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("waiting for consumer to consume...");
            }
        }
    }
}

class QueueConsumer implements Runnable{

    private Queue<Integer> queue;

    public QueueConsumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            if (!queue.isEmpty()) {

                System.out.println("Consuming: "+queue.poll());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("waiting for Producer to produce...");
            }
        }
    }
}

public class BlockingQueueDemo {

    public static void main(String args[]){
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new QueueProducer(queue));
        service.execute(new QueueConsumer(queue));
        service.shutdown();

    }

}
