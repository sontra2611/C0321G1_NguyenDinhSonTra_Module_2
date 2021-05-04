package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.time.LocalTime;
import java.util.Locale;

public class StopWatch {
    private LocalTime starTime, endTime;

    public StopWatch() {

        starTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.starTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStarTime() {

        return starTime;
    }

    public LocalTime getEndTime() {

        return endTime;
    }

    public void start() {
        starTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int miliSecond = ((endTime.getHour() - starTime.getHour()) * 3600 + (endTime.getMinute() - starTime.getMinute()) * 60 + (endTime.getSecond() - starTime.getSecond()) * 1000);
        return miliSecond;
    }

    public static int[] selectionSort(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        LocalTime start = LocalTime.now();
        selectionSort(arr);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(start, end);
        System.out.println("Time: " + sw.getElapsedTime());
    }
}
