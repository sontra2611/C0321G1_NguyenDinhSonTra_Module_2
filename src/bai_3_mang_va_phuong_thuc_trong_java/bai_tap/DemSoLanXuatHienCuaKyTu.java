package bai_3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String str = scanner.nextLine();
        System.out.println("nhập ký tự bạn muốn kiểm tra ");
        char kyTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + "'" + kyTu + "'" + " trong chuỗi là : " + count);
    }
}
