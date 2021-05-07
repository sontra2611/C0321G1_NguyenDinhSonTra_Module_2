package bai_6_ke_thua.bai_tap.point_and_moveable_point;

import bai_6_ke_thua.bai_tap.point_2d_and_point_3d.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Point test1Point = new Point();
        System.out.println("Point 1 : " + test1Point); // test defaut constructor

        Point test2Poin = new Point(1,2);// test constructor
        System.out.println("Point 2 : " + test2Poin);

        //test setter
        test2Poin.setX(3);
        test2Poin.setY(4);
        System.out.println("Point 2 after setX and setY : " + test2Poin);

        //test setterXY, getterXY
        test2Poin.setXY(5,6);
        System.out.println("Point 2 after setXY : " + test2Poin);
        float[] arr = test2Poin.getXY();
        for (int i = 0; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
