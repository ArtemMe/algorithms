package multithreading.deadlock;
/**
 * Запускать много раз придется но дедлок тут есть
 * */
public class Main {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyT1 myT1 = new MyT1();
        MyT2 myT2 = new MyT2();
        myT1.resourceA = resourceA;
        myT2.resourceB = resourceB;
        myT1.start();
        myT2.start();
    }
}

class MyT1 extends Thread{
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}
class MyT2 extends Thread{
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}

class ResourceA {
    ResourceB resourceB;
    public synchronized int getI() {
        return resourceB.returnI();
    }
    public synchronized int returnI(){
        return 1;
    }
}

class ResourceB {
    ResourceA resourceA;

    public synchronized int getI() {
        return resourceA.returnI();
    }

    public synchronized int returnI(){
        return 2;
    }
}