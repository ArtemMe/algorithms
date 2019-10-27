package multithreading.searching_files.with_multi;

import java.util.List;
import java.util.regex.Pattern;

public interface ParseHandler {
    void taskStartUnblock();
    void schedule(BackLogTask backLogTask);

    Pattern getPattern();

    void taskComplete(List<String> result);

    void taskFinishUnblock();
}
