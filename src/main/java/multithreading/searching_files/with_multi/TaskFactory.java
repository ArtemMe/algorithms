package multithreading.searching_files.with_multi;

import java.io.File;
import java.util.List;

public class TaskFactory {
    public static BackLogTask createWalking1Task(ParseHandler parseHandler, List<File> dirPaths) {
        return new WalkinTask(parseHandler, dirPaths);
    }
    public static BackLogTask createParseTask(ParseHandler parseHandler, List<String> filePaths) {
        return new ParseTask(parseHandler, filePaths);
    }
}
