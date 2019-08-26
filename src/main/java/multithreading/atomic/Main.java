package multithreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
//    static  int i;
    //если не юзать атомик то получим 9998 примерно так как два потока могут инкрементить одно и то же значение

    static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10_000; j++) {
            new MyT().start();
        }
        Thread.sleep(2_000);
        System.out.println(atomicInteger.get());
    }

    static class MyT extends Thread{
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}
