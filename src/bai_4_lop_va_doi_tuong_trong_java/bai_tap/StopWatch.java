package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.time.LocalTime;
import java.util.Locale;

public class StopWatch {
    private long starTime, endTime;
    public StopWatch() {
    }
    public long getStarTime() {
        return starTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void star() {
        starTime = System.currentTimeMillis();
    }
    public void end() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - starTime;
    }
}
