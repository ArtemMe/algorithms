package multithreading.countDownLanch;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch countDownLatch = new CountDownLatch(3);
//        new Worker(countDownLatch);
//        new Worker(countDownLatch);
//        new Worker(countDownLatch);
//
//        countDownLatch.await();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

class Worker extends Thread {
    CountDownLatch countDownLatch;

    public Worker(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            this.sleep(1000);
            System.out.println("work is done");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}