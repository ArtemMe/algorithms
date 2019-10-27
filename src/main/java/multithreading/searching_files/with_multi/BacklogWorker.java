package multithreading.searching_files.with_multi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс запускающий задачи в пулле потоков
 * Основные требование к классу:
 *  — класс должен наследоваться от Thread (в принципе можно только интерфейс Runnable, но так проще)
 *  — класс должен принимать на выполнения объекты Runnable
 *  — класс не должен падать при возникновении каких-то исключений в результате выполнения таска.
 *  — если нету никаких задач, Thread не должен работать в пустую, а должен уходить в ожидание
 *  — процедура добавления новых объектов Runnable должна быть очень быстрая, иначе при большом количестве мелких задач,
 *     кто-нибудь будет либо блокировать работу треда, либо ждать возможности добавить новую задачу в тред
 *  — ну и он должен быть ThreadSafe
 * */

public class BacklogWorker extends Thread {

    // Таски для выполнения
    private final LinkedList<Runnable> backlog = new LinkedList<>();
    private static final int INITIAL_CAPACITY = 100;

    //здесь хранятся таски, которые будут выполнятся
    private final List<Runnable> workQueue = new ArrayList<Runnable>(INITIAL_CAPACITY);

    BacklogWorker(String name) {
        super(name);
    }

    //добавить новый таск
    synchronized void enque(Runnable work) {
        if(work != null) {
            backlog.add(work);
        }
        notify();
    }

    @Override
    public void run() {
        while(!isInterrupted()) {
            //Добавляем в очредь на выполнение workQueue
            synchronized (this) {
                if(!backlog.isEmpty()){
                    int backlogSize = backlog.size();
                    for(int i = 0; i < INITIAL_CAPACITY && i < backlogSize; i++) {
                        workQueue.add(backlog.poll());
                    }
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        interrupt();
                    }
                }
            }

            //Запускаем выполнение тасков
            for (Runnable task : workQueue) {
                task.run();
            }
            workQueue.clear();
        }
    }
}
