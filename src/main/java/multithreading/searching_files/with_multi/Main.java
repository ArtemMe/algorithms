package multithreading.searching_files.with_multi;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        BacklogThreadPool pool = new BacklogThreadPool(4, null);
        String pattern = ".*\\.mp3$";
        File dir = new File("C:\\Users\\amejelovskiy");
        List list = new ArrayList();
        list.add(dir);
        Long before =  System.nanoTime();
        ParseHandler parseHandler = new ParseHandlerImpl(pattern, pool);
        parseHandler.schedule(TaskFactory.createWalking1Task(parseHandler, list));

        Long after = System.nanoTime();

        System.out.println((after - before)/1000000000+" с");
    }
}
