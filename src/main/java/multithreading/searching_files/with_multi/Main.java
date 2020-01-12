package multithreading.searching_files.with_multi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BacklogThreadPool pool = new BacklogThreadPool(4, null);
        String pattern = ".*\\.mp3$";
        File dir = new File("D:\\");
        List list = new ArrayList();
        list.add(dir);
        Long before =  System.nanoTime();
        ParseHandler parseHandler = new ParseHandlerImpl(pattern, pool);
        parseHandler.schedule(TaskFactory.createWalking1Task(parseHandler, list));

        Long after = System.nanoTime();

        System.out.println((after - before)/1000000000+" с");
    }
}
