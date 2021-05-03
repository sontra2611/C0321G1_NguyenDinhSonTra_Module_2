package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        int row, col;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];
        int index1 = 0,index2 = 0;
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Phần tử lớn nhất trong mảng là : "+max);
        System.out.print("Và nằm ở vị trí : [" + index1 +"][" + index2 + "]" );
    }
}
