package multithreading.searching_files.with_multi;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTask implements BackLogTask {

    private ParseHandler handler;
    private List<String> paths;
    private Integer id;

    public ParseTask(ParseHandler hander, List<String> paths) {
        this.handler = hander;
        this.paths = paths;
        handler.taskStartUnblock();
    }

    @Override
    public void run() {
        try {
            Pattern pattern = handler.getPattern();
            List<String> result = new ArrayList<String>();
            for (String path : paths) {
                Matcher matcher = pattern.matcher(path);
                while (matcher.find()) {
                    String str = matcher.group();
                    if (!"".equals(str)) {
                        result.add(str);
                    }
                }
            }
            handler.taskComplete(result);
        } finally {
            handler.taskFinishUnblock();
        }
    }


    @Override
    public int getTaskType() {
        return 1;  //TODO
    }

    @Override
    public int getTaskId() {
        return id;
    }

    @Override
    public void setTaskId(Integer id) {
        this.id =  id;
    }
}
