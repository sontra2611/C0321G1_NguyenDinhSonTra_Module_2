package bai_7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "yellow", false);
        shapes[1] = new Rectangle(4, 8, "infinity", true);
        shapes[2] = new Square(6, "melinda", true);
        System.out.println("Before increasing in size : \n");
        for (Shape a : shapes){
            System.out.println(a);
        }

        System.out.println("\nAfter increasing in size :");
        for (Shape a : shapes) {
            a.resize(Math.floor(Math.random() * 100) + 1);
        }
        System.out.println();
        Shape.printShape(shapes);
    }
}
