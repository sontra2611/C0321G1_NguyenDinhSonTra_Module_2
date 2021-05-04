package bai_4_lop_va_doi_tuong_trong_java.thuc_hanh;

import bai_1_introducing_to_java.thuc_hanh.Main;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}




