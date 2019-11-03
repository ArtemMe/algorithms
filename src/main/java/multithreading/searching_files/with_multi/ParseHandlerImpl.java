package multithreading.searching_files.with_multi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class ParseHandlerImpl implements ParseHandler {
    private HashMap<Integer, BackLogTask> storeBackLogTask = new HashMap<>();
    private String pattern;
    BacklogThreadPool pool;
    AtomicInteger id = new AtomicInteger();
    AtomicInteger counter = new AtomicInteger();

    public ParseHandlerImpl(String pattern, BacklogThreadPool pool) {
        this.pattern = pattern;
        this.pool = pool;
    }

    @Override
    public void taskStartUnblock() {
        counter.incrementAndGet();
    }

    @Override
    public void schedule(BackLogTask backLogTask) {
        storeBackLogTask.put(id.incrementAndGet(), backLogTask);

        pool.execute(backLogTask);
    }

    @Override
    public Pattern getPattern() {
        return Pattern.compile(pattern);
    }

    @Override
    public void taskComplete(List<String> result) {
        for(String s : result) {
            System.out.println(s);
        }
    }

    @Override
    public void taskFinishUnblock() {
        int res = counter.decrementAndGet();
        if(res <= 0) {
            pool.shutdown();
        }
    }
}
