package com.parallel.ctx;

import java.util.concurrent.*;

class Worker implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return (int)(Math.random()*12+1);
    }
}


public class CallableDemo {

    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(6);
        for (int i=0;i<12;i++){
            Future<Integer> future = service.submit(new Worker());
            try {
                System.out.println("The Lucky 7 up/down/or seven : "+future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        service.shutdown();
    }

}
