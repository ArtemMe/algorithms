package multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * как в примере про synchronize
 * */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i = 5;
        MyT myT1 = new MyT();
        myT1.setName("one");
        MyT myT2 = new MyT();
        myT1.setResource(resource);
        myT2.setResource(resource);
        myT1.start();
        myT2.start();
        myT1.join();
        myT2.join();
        System.out.println(resource.i);
    }
}

class MyT extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
        resource.changeJ();
        resource.changeK();
    }
}

class Resource {
    int i;
    int j;
    int k;
    Lock lock = new ReentrantLock();

    public void changeI(){
        lock.lock(); // аналог синхронайза только более гибкий
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }

        int i = this.i;
        i++;
        this.i = i;
        lock.unlock();
    }

    public void changeJ(){
        lock.lock(); // Почему гибкий. Птому что мы можем начать лочить тут
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }

        int j = this.j;
        j++;
        this.j = j;
    }
    public void changeK(){
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }

        int k = this.k;
        k++;
        this.k = k;
        lock.unlock(); // а закончить лочить тут
    }
}
