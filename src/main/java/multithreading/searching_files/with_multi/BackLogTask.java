package multithreading.searching_files.with_multi;

public interface BackLogTask extends Runnable {
    int getTaskType();
    int getTaskId();
    void setTaskId(Integer id);
}
