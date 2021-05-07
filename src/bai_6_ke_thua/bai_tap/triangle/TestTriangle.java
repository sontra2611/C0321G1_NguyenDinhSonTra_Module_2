package bai_6_ke_thua.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color :");
        String color = scanner.nextLine();
        System.out.println("Enter size 1 :");
        double size1 = scanner.nextDouble();
        System.out.println("Enter size 2 :");
        double size2 = scanner.nextDouble();
        System.out.println("Enter size 3 :");
        double size3 = scanner.nextDouble();

        Triangle triangle1 = new Triangle();
        System.out.println("Triangle 1 : \n" + triangle1);

        System.out.println();

        Triangle triangle2 = new Triangle(size1,size2,size3,color,false);
        System.out.println("Triangle 2 : \n" + triangle2);
    }
}
