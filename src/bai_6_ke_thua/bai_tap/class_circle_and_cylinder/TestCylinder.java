package bai_6_ke_thua.bai_tap.class_circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3);
        System.out.println(cylinder);

        cylinder = new Cylinder(2, "black",4);
        System.out.println(cylinder);
    }
}
