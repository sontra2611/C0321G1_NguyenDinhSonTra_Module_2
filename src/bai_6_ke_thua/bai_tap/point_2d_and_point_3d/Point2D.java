package bai_6_ke_thua.bai_tap.point_2d_and_point_3d;

public class Point2D {
    private float x;
    private float y;
    Point2D(){
    }

    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," +this.y + ")";
    }
}
