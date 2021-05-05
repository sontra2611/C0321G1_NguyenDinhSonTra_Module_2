package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.time.LocalTime;

public class StopWatchOOP {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.star();
        int arr[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        stopWatch.end();
        System.out.println("Time :" + stopWatch.getElapsedTime());
    }
}
