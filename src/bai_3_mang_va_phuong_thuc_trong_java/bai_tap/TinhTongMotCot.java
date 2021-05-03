package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        int row, col;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        col = scanner.nextInt();

        double[][] array = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int x;
        double sum = 0;
        System.out.println("nhập Cột bạn muốn tính");
        x = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][x];
        }
        System.out.println("tổng của cột thứ " + x + " là : " + sum);
    }
}
