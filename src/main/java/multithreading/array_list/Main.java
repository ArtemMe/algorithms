package multithreading.array_list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>();

        arr.add(0,"zer");
        arr.add(1,"firs");
        arr.add(2,"sec");

        Th1 th1 = new Th1();
        Th2 th2 = new Th2();
        th1.setArr(arr);
        th2.setArr(arr);

        th1.start();
        th2.start();


        Thread.sleep(500);
        for (String s : arr) {
            System.out.println(s);
        }
    }


    static class Th1 extends Thread {
        CopyOnWriteArrayList<String> arr;

        public void setArr(CopyOnWriteArrayList<String> arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            Thread.yield();

        }
    }

    static class Th2 extends Thread {
        CopyOnWriteArrayList<String> arr;

        public void setArr(CopyOnWriteArrayList<String> arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            arr.add(1,null);
        }
    }
}
