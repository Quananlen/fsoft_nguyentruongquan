package unit4_class__object_in_java.exercise;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
    }
    public long getStartTime() {
        return startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    void start() {
        startTime = System.currentTimeMillis();
    }
    void stop() {
        endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return endTime - startTime;
    }
}

