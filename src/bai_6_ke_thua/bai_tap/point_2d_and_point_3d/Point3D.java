package bai_6_ke_thua.bai_tap.point_2d_and_point_3d;

public class Point3D extends Point2D {
    private float z;
    Point3D(){
    }

    Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {getX(),getY(),z};
        return arr;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
