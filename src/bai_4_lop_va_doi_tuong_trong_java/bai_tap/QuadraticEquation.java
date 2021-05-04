package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        double delta = b * 2 - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
        return r2;
    }

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
