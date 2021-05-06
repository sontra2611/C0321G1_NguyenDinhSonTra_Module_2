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
    public String toString() {
        if (getDiscriminant() < 0) {
            return "The equation has no roots.";
        } else if (getDiscriminant() == 0) {
            return "The equation has one root is: " + getRoot1();
        } else {
            return "The first root is: " + getRoot1()
                    + "\nThe second root is: " + getRoot2();
        }
    }
}
