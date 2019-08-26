package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);
        Person t1 = new Person();
        Person t2 = new Person();
        Person t3 = new Person();
        Person t4 = new Person();

        t1.table = table;
        t2.table = table;
        t3.table = table;
        t4.table = table;

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Person extends Thread {
    Semaphore table;

    @Override
    public void run() {
        try {
            table.acquire();
            System.out.println(this.getName()+" start eating");
            this.sleep(1000);
            System.out.println(this.getName()+ " end eating");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}