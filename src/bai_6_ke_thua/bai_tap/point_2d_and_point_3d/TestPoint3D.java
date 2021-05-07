package bai_6_ke_thua.bai_tap.point_2d_and_point_3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D tes1Point3D = new Point3D();
        System.out.println(tes1Point3D);

        Point3D test2Point3D = new Point3D(7,8,9);
        System.out.println(test2Point3D);

        test2Point3D.setX(10);
        test2Point3D.setY(11);
        test2Point3D.setZ(12);
        System.out.println(test2Point3D);
        System.out.println(test2Point3D.getX());
        System.out.println(test2Point3D.getY());
        System.out.println(test2Point3D.getZ());

        test2Point3D.setXYZ(13,14,15);
        System.out.println(test2Point3D);
        float[] arr = test2Point3D.getXYZ();
        for (int i = 0; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
