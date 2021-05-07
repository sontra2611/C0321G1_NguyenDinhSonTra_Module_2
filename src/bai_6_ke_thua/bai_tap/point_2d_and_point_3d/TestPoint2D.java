package bai_6_ke_thua.bai_tap.point_2d_and_point_3d;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D test1Point2D = new Point2D();
        System.out.println(test1Point2D); // test defaut constructor

        Point2D test2Poin2D = new Point2D(1,2);// test constructor
        System.out.println(test2Poin2D);

        //test setter,getter
        test2Poin2D.setX(3);
        test2Poin2D.setY(4);
        System.out.println(test2Poin2D);
        System.out.println(test2Poin2D.getX());
        System.out.println(test2Poin2D.getY());

        //test setterXY, getterXY
        test2Poin2D.setXY(5,6);
        System.out.println(test2Poin2D);
        float[] arr = test2Poin2D.getXY();
        for (int i = 0; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
