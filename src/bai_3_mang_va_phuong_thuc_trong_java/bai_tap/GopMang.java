package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size = 5;
        Scanner scanner = new Scanner(System.in);
        int[] array1, array2;
        array1 = new int[size];
        System.out.println("Enter elements of array1");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter Element of " + i + ":");
            array1[i] = scanner.nextInt();
        }
        System.out.print("array1 : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        array2 = new int[size];
        System.out.println("\nEnter elements of array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter Element " + i + ":");
            array2[i] = scanner.nextInt();
        }
        System.out.print("array2 : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        int[] array3 = new int[array1.length + array2.length];
        int pos = 0;
        for (int element : array1) {
            array3[pos] = element;
            pos++;
        }
        for (int element : array2) {
            array3[pos] = element;
            pos++;
        }

        System.out.print("\nnew array after merging : ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
