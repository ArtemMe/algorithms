package multithreading.searching_files.with_multi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WalkinTask implements BackLogTask {
    private List<File> dirs;
    private ParseHandler parseHandler;
    private Integer id;

    public WalkinTask(ParseHandler parseHandler, List<File> dirs) {
        this.parseHandler = parseHandler;
        //this.parseHandler.taskStart();
        this.parseHandler.taskStartUnblock();
        this.dirs = dirs;
    }

    @Override
    public void run() {
        try {
            List<String> filePaths = new ArrayList<String>();
            List<File> dirPaths = new ArrayList<File>();
            for (File dir : dirs) {
                if (!dirPaths.isEmpty()) {
                    dirPaths = new ArrayList<File>();
                }
                if (!filePaths.isEmpty()) {
                    filePaths = new ArrayList<String>();
                }
                File listFile[] = dir.listFiles();

                if (listFile != null) {
                    for (File file : listFile) {
                        if (file.isDirectory()) {
                            dirPaths.add(file);
                        } else {
                            filePaths.add(file.getPath());
                        }
                    }
                }
                if (!dirPaths.isEmpty()) {
                    parseHandler.schedule(TaskFactory.createWalking1Task(parseHandler, dirPaths));
                }
                if (!filePaths.isEmpty()) {
                    parseHandler.schedule(TaskFactory.createParseTask(parseHandler, filePaths));
//                    Pattern pattern = parseHandler.getPattern();
//                    List<String> result = new ArrayList<String>();
//                    for (String path : filePaths) {
//                        Matcher matcher = pattern.matcher(path);
//                        while (matcher.find()) {
//                            String str = matcher.group();
//                            if (!"".equals(str)) {
//                                result.add(str);
//                            }
//                        }
//                    }
//                    parseHandler.taskComplete(result);
                }
            }
        } finally {
            //parseHandler.taskFinish();
            parseHandler.taskFinishUnblock();
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
