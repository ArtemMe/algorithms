package multithreading.wait_notify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new Operator().start();
        new Printer().start();
    }
    static class Operator extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (list) {
                    String s = scanner.nextLine();
                    list.add(s);
                    list.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Printer extends Thread{
        @Override
        public void run() {
            while (true) {
                synchronized (list) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("removed item: "+ list.remove(0));
                }
            }
        }
    }
}