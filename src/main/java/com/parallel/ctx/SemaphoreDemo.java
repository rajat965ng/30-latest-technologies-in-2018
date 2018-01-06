package com.parallel.ctx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

enum DataSourceSingleton{
    INSTANCE;

    private Semaphore semaphore = new Semaphore(3,true);

    public void downloadData(){
        try {
            semaphore.acquire();
            download();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    private void download() {
        try {
            Thread.sleep(3000);
            System.out.println("Waiting for 3 seconds....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Downloading the data from web....");
    }
}

public class SemaphoreDemo {

    public static void main(String args[]){
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            service.execute(()->{
                DataSourceSingleton.INSTANCE.downloadData();
            });
        }
        service.shutdown();
    }
}
