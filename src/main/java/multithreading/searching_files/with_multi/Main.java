package multithreading.searching_files.with_multi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BacklogThreadPool pool = new BacklogThreadPool(4, null);
        String pattern = ".*\\.mp3$";
        File dir = new File("C:\\Users\\amejelovskiy\\Music\\");
        List list = new ArrayList();
        list.add(dir);

        ParseHandler parseHandler = new ParseHandlerImpl(pattern, pool);
        parseHandler.schedule(TaskFactory.createWalking1Task(parseHandler, list));
    }
}
