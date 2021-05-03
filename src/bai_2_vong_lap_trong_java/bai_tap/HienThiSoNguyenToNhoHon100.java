package bai_2_vong_lap_trong_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        String result = "Các số nguyên tố là : ";
        for (int n = 2; n < 100; n++){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) check = false;
            }
            if (check) {
                result += n + ", ";
            }
        }
        System.out.println(result);
    }
}
