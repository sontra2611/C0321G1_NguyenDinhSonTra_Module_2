package bai_1_introducing_to_java.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd,vnd;
        final double rate = 23000;
        System.out.println("nhập vào số USD bạn muốn chuyển đổi : ");
        usd = scanner.nextDouble();
        vnd = usd * rate;
        System.out.println("Số tiền bạn nhận được là : " + vnd +" VND");
    }
}
