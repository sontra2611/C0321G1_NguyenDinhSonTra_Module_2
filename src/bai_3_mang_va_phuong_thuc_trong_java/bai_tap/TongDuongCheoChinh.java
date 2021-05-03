package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận arr vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
