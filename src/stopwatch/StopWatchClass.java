package stopwatch;

public class StopWatchClass {
    private long startTime;
    private long endTime;
    // pthức khởi tạo k tham số
    public StopWatchClass() {
        this.startTime = System.currentTimeMillis();// tạo starTime bằng thời gian hiện tại
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void star(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public  long getElapsedTime(){
        return endTime - startTime;
    }
}
