package com.parallel.ctx;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerBarrier implements Runnable{

    private CyclicBarrier barrier;
    private int id;
    private Random random;

    public WorkerBarrier(CyclicBarrier barrier, int id) {
        this.barrier = barrier;
        this.id = id;
        random = new Random();
    }

    @Override
    public void run() {
        System.out.println("Worker Barrier "+id+" is doing the task ....");
        try{
            Thread.sleep(random.nextInt(3000));
            barrier.await();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Task finished by ID:"+id);
    }
}

public class CyclicBarrierDemo {

    public static void main(String args[]){
        ExecutorService service = Executors.newCachedThreadPool();
        CyclicBarrier barrier = new CyclicBarrier(3);

        for(int i=0;i<barrier.getParties();i++){
            service.execute(new WorkerBarrier(barrier,i+1));

        }

        barrier.reset();

        for(int i=4;i<7;i++){
            service.execute(new WorkerBarrier(barrier,i+1));

        }

        service.shutdown();
    }

}
