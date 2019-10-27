package multithreading.searching_files.with_multi;

import java.util.concurrent.Executor;

public class BacklogThreadPool implements Executor {

    private final BacklogWorker workers[];
    private final int mask;
    private static volatile int sequence;

    public BacklogThreadPool(int threadCount, String id) {
        int tc;
        for(tc = 1; tc < threadCount; tc <<= 1);
        mask = tc -1;

        if(id == null) {
            id = Integer.toString(getSequence());
        }
        workers = new BacklogWorker[tc];

        for(int i = 0; i < tc; i++) {
            workers[i] = new BacklogWorker((new StringBuilder()).append("thead-pool-worker-").append(id).append(":").append(i).toString());
            workers[i].start();
        }
    }

    private synchronized int getSequence() {
        return sequence++;
    }

    public void shutdown() {
        for(int i = 0; i < workers.length; i++) {
            workers[i].interrupt();
        }
    }

    @Override
    public void execute(Runnable command) {
        workers[command.hashCode() & mask].enque(command);
    }
}
