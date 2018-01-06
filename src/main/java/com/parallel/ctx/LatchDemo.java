package com.parallel.ctx;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{

    private CountDownLatch latch;
    private int id;
    public Processor(int id,CountDownLatch latch){
        this.latch = latch;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Processing Task id: "+id+"....");
        latch.countDown();
        System.out.println("Get Latch Count: "+latch.getCount());
    }
}

public class LatchDemo {

    public static void main(String args[]){

        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i=0;i<3;i++){
            service.execute(new Processor(i+1,latch));
            try {
                latch.await(3000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Processing done !!");
        service.shutdown();
    }

}
