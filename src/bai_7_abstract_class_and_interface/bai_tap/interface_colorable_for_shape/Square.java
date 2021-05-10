package bai_7_abstract_class_and_interface.bai_tap.interface_colorable_for_shape;

public class Square extends bai_7_abstract_class_and_interface.bai_tap.interface_resizeable_for_shape.Square implements Colorable {
   public Square(double size, String color, boolean filled){
       super(size,color,filled);
   }
    @Override
   public void howToColor(){
        System.out.println("Color all four sides");
    }
}
