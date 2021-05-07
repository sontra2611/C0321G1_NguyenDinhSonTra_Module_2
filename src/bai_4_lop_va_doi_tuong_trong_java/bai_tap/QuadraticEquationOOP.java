package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquationOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the a :");
        double a = input.nextDouble();
        System.out.println("Please enter the b :");
        double b = input.nextDouble();
        System.out.println("Please enter the c :");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.solve());
    }
}
