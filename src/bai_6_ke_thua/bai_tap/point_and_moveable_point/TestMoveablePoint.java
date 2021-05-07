package bai_6_ke_thua.bai_tap.point_and_moveable_point;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint test1 = new MoveablePoint();
        System.out.println("Point 1 : " + test1);

        MoveablePoint test2 = new MoveablePoint(1,2);
        System.out.println("Point 2 : " + test2);
        test2.move(); // Test move
        System.out.println("Point 2 after move : " + test2);

        MoveablePoint test3 = new MoveablePoint(1,2,3,4);
        System.out.println("Point 3 : " + test3);
        test3.move(); //test move
        System.out.println("Point 3 after move : " + test3);
    }
}
