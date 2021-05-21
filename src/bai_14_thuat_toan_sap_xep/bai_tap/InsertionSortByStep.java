package bai_14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước danh sách :");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị thứ %d : ", i);
            list[i] = scanner.nextInt();
        }

        System.out.print("Danh sách bạn đã nhập vào : ");
        Arrays.toString(list);

        System.out.println("\nBắt đầu xử lý sắp xếp...");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            System.out.println("gán key = " + list[i]);
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                System.out.println("so sánh giá trị tại vị trí list[" + j + "] = " + list[j] + " với key = " + key);
                System.out.println("vì " + list[j] + " > " + key);
                System.out.println("Dịch chuyển " + list[j] + " sang " + list[j + 1]);
                list[j + 1] = list[j];
                j--;
                System.out.println("Danh sách hiện tại : " + Arrays.toString(list));
            }

            System.out.println("Gán key = " + key + " lại cho giá trị tại vị trí list[" + (j + 1) + "]");
            list[j + 1] = key;
            System.out.println("Danh sách hiện tại : " + Arrays.toString(list));
        }
    }
}
