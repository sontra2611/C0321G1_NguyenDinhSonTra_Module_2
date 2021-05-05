package bai_4_lop_va_doi_tuong_trong_java.bai_tap;

public class FanOOP {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,"yellow",true);
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println("fan1: \n" + fan1.toString());
        System.out.println("fan2: \n" + fan2.toString());
    }
}
