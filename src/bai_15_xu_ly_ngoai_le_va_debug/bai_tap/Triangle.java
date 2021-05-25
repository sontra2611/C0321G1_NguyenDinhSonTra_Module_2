package bai_15_xu_ly_ngoai_le_va_debug.bai_tap;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;

    public Triangle(double size1, double size2, double size3) throws IllegalTriangleException,NumberFormatException {
        if (size1 <= 0 || size2 <= 0 || size3 <= 0) {
            throw new IllegalTriangleException("Không phải tam giác vì cạnh < 0");
        } else if (size1 + size2 <= size3 || size1 + size3 <= size2 || size2 + size3 <= size1) {
            throw new IllegalTriangleException("Không phải tam giác vì tổng 2 cạnh bé hơn cạnh còn lại");
        } else {
            this.size1 = size1;
            this.size2 = size2;
            this.size3 = size3;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                '}';
    }
}
