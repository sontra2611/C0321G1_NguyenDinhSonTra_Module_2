package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int n = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to insert : ");
        int num = scanner.nextInt();
        System.out.println("Enter the index to insert : ");
        int index = scanner.nextInt();
        if (index < 0 || index > arr.length-1){
            System.out.println("element cannot be inserted into the array");
        }else {
            System.out.print("array before inserting : ");
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }

            for (int i = 5; i >= index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = num;

            System.out.print("\narray after inserting : ");
            for (int j = 0; j <= n; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
