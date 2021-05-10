package bai_7_abstract_class_and_interface.bai_tap.interface_colorable_for_shape;

import bai_7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Circle;
import bai_7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Rectangle;
import bai_7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Shape;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4,"red",false);
        shapes[1] = new Rectangle(3,7,"black",true);
        shapes[2] = new Square(8,"white",true);

        for (Shape a : shapes){
            System.out.println(a);

            if (a instanceof Colorable) {
                Colorable colorable = (Colorable) a;
                colorable.howToColor();
            }
        }
    }
}
