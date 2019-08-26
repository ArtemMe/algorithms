package multithreading.vola;

public class Main {
    static  int i;

    public static void main(String[] args) throws InterruptedException {
        MyTheadWriter writer = new MyTheadWriter();
        MyThreadReader reader = new MyThreadReader();
        writer.start();
        reader.start();

        writer.join();
        reader.join();
    }

    static class MyThreadReader extends Thread {
        @Override
        public void run() {
            int local = i;
            while (local < 5){
                if(local != i) {
                    System.out.println("Reader "+i);
                    local = i;
                }
            }
        }
    }
    static class MyTheadWriter extends Thread {
        @Override
        public void run() {
            while(i<5) {
                i++;
                System.out.println("Writer "+ i);
            }
        }
    }
}
