package bai_15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;

    public Triangle(double size1, double size2, double size3) throws IllegalTriangleException{
        if(size1+size2<size3 || size1+size3<size2 || size2+size3<size1 || size1 < 0 || size2 <0 || size3 < 0)
            throw new IllegalTriangleException("Đây không phải tam giác");
        else{
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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác : ");
        System.out.println("Nhập canh thứ nhất :");
        int size1 = scanner.nextInt();
        System.out.println("Nhập canh thứ hai :");
        int size2 = scanner.nextInt();
        System.out.println("Nhập canh thứ ba :");
        int size3 = scanner.nextInt();

        try {
            Triangle triangle = new Triangle(size1, size2, size3);
            System.out.println(triangle.toString());
        }
        catch (IllegalTriangleException e){
            System.out.println(e);
        }
    }
}
