package bai_15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            try {
                System.out.println("Nhập vào 3 cạnh của tam giác : ");
                System.out.println("Nhập canh thứ nhất :");
                int size1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập canh thứ hai :");
                int size2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập canh thứ ba :");
                int size3 = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(size1, size2, size3);
                System.out.println(triangle.toString());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Bạn nhập không hợp lệ, vui lòng nhập số");
                check = true;
            } catch (IllegalTriangleException e) {
                System.err.println(e);
                check = true;
            }
        } while (check);
    }
}
