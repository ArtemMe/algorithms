package multithreading.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        //Создание экзекьютора через фабрику
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //Создание экзекютора на прямую
        ExecutorService directExecutorService =  new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        //Создание тасков
        Runnable runnableTask = () -> {
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            TimeUnit.MICROSECONDS.sleep(300);
            return "end";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

        executorService.execute(runnableTask);

        //Чтобы получить результат работы потока
        Future<String> future = executorService.submit(callableTask);
        //Получаем резлльтат выполения потока
        String result = future.get();
        //Можно проставить время которое ожидать, если оно истекло выкинется исключение TimeoutException
        String resultTimeout = future.get(100, TimeUnit.MICROSECONDS);
        //Можно проверить закончилось ли выполнение таска
        future.isDone();
        //Отменить таски
        boolean canceled = future.cancel(true);
        boolean isCancelled = future.isCancelled();

        //Исполняет все таски и возвращает результат ОДНОГО таска!
        String futureAny = executorService.invokeAny(callableTasks);

        //Исполняет все таски и возвращает результат всех тасков
        List<Future<String>> futureAll = executorService.invokeAll(callableTasks);

        //Шедулеры по расписанию
        ScheduledExecutorService shedulerExecSrv = Executors.newSingleThreadScheduledExecutor();
        Future<String> resultFuture = shedulerExecSrv.schedule(callableTask, 1, TimeUnit.SECONDS);
        //Запускается через определенный интервал
        Future<String> atFixedRate = shedulerExecSrv.scheduleAtFixedRate(runnableTask, 100, 450, TimeUnit.MILLISECONDS);

        //Остановка шедулеров
        executorService.shutdown(); // останавливает шедулеры дожидаясь пока они законччат работу
        executorService.shutdownNow(); // останавливает шедулеры НЕ дожидаясь пока они закончат работу

        //Можно установить таймаут на ожидание остановки
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

    }
}
