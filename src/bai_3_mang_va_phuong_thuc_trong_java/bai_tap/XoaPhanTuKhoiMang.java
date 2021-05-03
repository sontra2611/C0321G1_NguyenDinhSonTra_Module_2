package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1,6,3,4,5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập vào phần tử bạn muốn xoá : ");
        int x = scanner.nextInt();
        int index = searchElement(array, x);
        if (index == -1){
            System.out.println("không tìm thấy phần tử muốn xoá");
        }else {
            System.out.print("Mảng trước khi xoá: ");
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            array = deleteElement(array, index);
            System.out.print("\nMảng sau khi xoá : ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
        }
    }

    static int searchElement(int[] arr, int x){
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    static int[] deleteElement(int[] arr, int index) {
        int[] newArray = new int[arr.length-1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i >= index){
                newArray[i] = arr[i+1];
            }else {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
}
