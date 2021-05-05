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
        double discriminant = quadraticEquation.getDiscriminant();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();

        if (discriminant < 0)
        {
            System.out.println("The equation has no roots.");
        }
        else if (discriminant == 0)
        {
            System.out.println("The equation has one root is: " + r1);
        }
        else
        {
            System.out.println("The first root is: " + r1);
            System.out.println("The second root is: "+ r2);
        }
    }
}
