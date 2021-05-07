package bai_6_ke_thua.bai_tap.triangle;

public class Triangle extends Shape {
    double size1 = 1;
    double size2 = 1;
    double size3 = 1;
    Triangle(){
    }

    Triangle(double size1,double size2,double size3,String color, boolean filled){
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        double s = Math.sqrt(p * (p - size1) * (p- size2) * (p - size3));
        return s;
    }

    public double getPerimeter(){
        return size1 + size2 + size3;
    }

    @Override
    public String toString() {
        return "size1 = " + size1
                + "\nsize2 = " + size2
                + "\nsize3 = " + size3
                + "\nArea = " + getArea()
                + "\nPerimeter = " + getPerimeter()
                + "\n" + super.toString();
    }
}
