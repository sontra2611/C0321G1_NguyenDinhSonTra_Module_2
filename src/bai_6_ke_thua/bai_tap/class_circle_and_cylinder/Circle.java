package bai_6_ke_thua.bai_tap.class_circle_and_cylinder;

public class Circle {
    private double radius = 1;
    private String color = "white";

    public Circle(){
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with color "
                + color
                + " and radius = "
                + radius
                + " and Area = "
                + getArea();
    }
}
