package multithreading.exchanger;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();
        new Worker(exchanger);
        new Anket(exchanger);

    }
}

class Worker extends Thread {
    Exchanger<String> exchanger;

    public Worker(Exchanger exchanger) {
        this.exchanger = exchanger;
        start();
    }

    @Override
    public void run() {
        try {
           exchanger.exchange("Hello");
           this.sleep(500);
           exchanger.exchange("bye");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Anket extends Thread {
    Exchanger<String> exchanger;

    public Anket(Exchanger exchanger) {
        this.exchanger = exchanger;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(exchanger.exchange(null));
            System.out.println(exchanger.exchange(null));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}