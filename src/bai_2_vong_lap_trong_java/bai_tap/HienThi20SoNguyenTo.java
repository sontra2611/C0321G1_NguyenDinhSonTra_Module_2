package bai_2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn muốn in ra : ");
        int numbers, count = 0, n = 2 ;
        String result = "Các số nguyên tố là : ";
        do {
            numbers = scanner.nextInt();
        }while (numbers <= 0);

        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) check = false;
            }
            if (check) {
                result += n + ", ";
                count++;
            }
            n++;
        }
        System.out.println(result);
    }
}
