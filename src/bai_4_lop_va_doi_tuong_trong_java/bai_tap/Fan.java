package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    final int slow = 1,medium = 2,fast=3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
    }

    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean on(){
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
       if (on == true){
           return "Speed : " + speed +"\nColor : " + color + "\nRadius : " + radius + "\nfan is on";
       }else {
           return "fan is off";
       }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,"yellow",true);
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println("fan1: \n" + fan1.toString());
        System.out.println("fan2: \n" + fan2.toString());
    }
}