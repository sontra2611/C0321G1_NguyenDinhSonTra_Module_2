package bai_6_ke_thua.bai_tap.triangle;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("yellow", false);
        System.out.println(shape);
    }
}
