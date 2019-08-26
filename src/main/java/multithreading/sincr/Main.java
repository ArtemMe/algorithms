package multithreading.sincr;

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
    }
}

class Resource {
    int i;

    public synchronized void changeI(){ //либо на метод вешаешь
        synchronized (this) {// либо как блок
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }

            int i = this.i;
            i++;
            this.i = i;
        }
    }
}