package bai_13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int value){
        if (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value){
                return middle;
            }else if (arr[middle] > value){
                return binarySearch(arr, 0,middle -1, value);
            }else {
                return binarySearch(arr, middle + 1, right, value);
            }
        }else {
            return -1;
        }
    }

    public static void sort(int[] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng :");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++){
            System.out.printf("Nhập phẩn tử thứ a[%d] = ", i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng sau khi đã sắp xếp : ");
        sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Nhập phần tử bạn cần tìm : ");
        int element = scanner.nextInt();

        System.out.println("Phần tử " + element + " nằm ở vị trí thứ : ");
        System.out.println(binarySearch(array, 0, length-1, element));
    }
}
