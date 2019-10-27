package multithreading.searching_files.with_multi;

import java.io.File;
import java.util.List;

public class TaskFactory {
    public static BackLogTask createWalking1Task(ParseHandler parseHandler, List<File> dirPaths) {
        return new WalkinTask(parseHandler, dirPaths);
    }
}
