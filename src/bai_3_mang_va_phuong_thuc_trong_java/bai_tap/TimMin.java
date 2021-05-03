package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int size = 5;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Nhập các phẩn tử của mảng :");
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập phần tử ở thứ " + i + ":");
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        System.out.print("Mảng vừa nhập : ");
        for (int i = 0; i< array.length; i++){
            if (array[i]<min){
                min = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nGiá trị nhỏ nhất trong mảng là : " + min);
    }
}
