package multithreading.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;

    public static void main(String[] args) throws InterruptedException {
        new AccountMinus().start();
        Thread.sleep(700);
        new AccountPlus().start();
    }

    static class AccountPlus extends Thread{
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread{
        @Override
        public void run() {
            if(account < 10) {
                lock.lock();
                try {
                    System.out.println("before : " +account);
                    condition.await();
                    System.out.println("after : " +account);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.unlock();
            }
            account -= 10;
            System.out.println("end "+account);
        }
    }
}
