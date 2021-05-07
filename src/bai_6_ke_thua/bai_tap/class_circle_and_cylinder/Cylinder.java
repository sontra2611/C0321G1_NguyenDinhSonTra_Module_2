package bai_6_ke_thua.bai_tap.class_circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 10;
    Cylinder(){
    }

    Cylinder(double height){
        this.height = height;
    }

    Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

    @Override
    public String toString(){
        return "A Cylinder with color "
                + getColor()
                + " and radius = "
                + getRadius()
                + " and height = "
                + height
                + " and volume = "
                +getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
