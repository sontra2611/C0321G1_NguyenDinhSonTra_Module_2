package bai_1_introducing_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static String donvi(int so) {
        String hienThi = "";
        switch (so){
            case 1 :
                hienThi = "one";
                break;
            case 2 :
                hienThi = "two";
                break;
            case 3 :
                hienThi = "three";
                break;
            case 4 :
                hienThi = "four";
                break;
            case 5 :
                hienThi = "five";
                break;
            case 6 :
                hienThi = "six";
                break;
            case 7 :
                hienThi = "seven";
                break;
            case 8 :
                hienThi = "eight";
                break;
            case 9 :
                hienThi = "nine";
                break;
        }
        return hienThi;
    }
    public static String tu10Den19(int so) {
        String hienThi = "";
        switch (so){
            case 0 :
                hienThi = "ten";
                break;
            case 1 :
                hienThi = "eleven";
                break;
            case 2 :
                hienThi = "twelve";
                break;
            case 3 :
                hienThi = "thir-teen";
                break;
            case 4 :
                hienThi = "four-teen";
                break;
            case 5 :
                hienThi = "fif-teen";
                break;
            case 6 :
                hienThi = "six-teen";
                break;
            case 7 :
                hienThi = "seven-teen";
                break;
            case 8 :
                hienThi = "eight-teen";
                break;
            case 9 :
                hienThi = "nine-teen";
                break;
        }
        return hienThi;
    }

    public static String hangChuc(int so) {
        String hienThi = "";
        switch (so){
            case 2 :
                hienThi = "twenty";
                break;
            case 3 :
                hienThi = "thirty";
                break;
            case 4 :
                hienThi = "fourty";
                break;
            case 5 :
                hienThi = "fifty";
                break;
            case 6 :
                hienThi = "sixty";
                break;
            case 7 :
                hienThi = "seventy";
                break;
            case 8 :
                hienThi = "eighty";
                break;
            case 9 :
                hienThi = "ninety";
                break;
        }
        return hienThi;
    }

    public static String hangTram(int so) {
        String hienThi = "";
        switch (so){
            case 1 :
                hienThi = "onehundred";
                break;
            case 2 :
                hienThi = "twohundred";
                break;
            case 3 :
                hienThi = "threehundred";
                break;
            case 4 :
                hienThi = "fourhundred";
                break;
            case 5 :
                hienThi = "fivehundred";
                break;
            case 6 :
                hienThi = "sixhundred";
                break;
            case 7 :
                hienThi = "sevenhundred";
                break;
            case 8 :
                hienThi = "eighthundred";
                break;
            case 9 :
                hienThi = "ninehundred";
                break;
        }
        return hienThi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String k1,k2,k3,s1,s2,s3,check;
        int d,c,t;
        System.out.print("Nhập số : ");
        String s = scanner.nextLine();
        if (s.equals("0")){
            System.out.println("zero");
        }else if (s.length()==1){
            k1 = s.substring(s.length()-1);
            d = Integer.parseInt(k1);
            s1 = donvi(d);
            System.out.print(s1);
        }else if (s.length()==2) {
            check = s.substring(0,1); // kiểm tra hàng chục
            if (check.equals("1")) {
                k1 = s.substring(s.length() - 1);
                d = Integer.parseInt(k1);
                s1 = tu10Den19(d);
                System.out.print(s1);
            }else {
                k1 = s.substring(s.length() - 1);
                d = Integer.parseInt(k1);
                s1 = donvi(d);
                k2 = s.substring(s.length()-2,1);
                c = Integer.parseInt(k2);
                s2 = hangChuc(c);
                System.out.print(s2 + " " + s1);
            }
        }else if (s.length()==3) {
            check = s.substring(1,2); // kiểm tra hàng chục
            if (check.equals("0")) {
                k1 = s.substring(s.length() - 1);
                d = Integer.parseInt(k1);
                s1 = donvi(d);
                k3 = s.substring(s.length()-3,1);
                t = Integer.parseInt(k3);
                s3 = hangTram(t);
                System.out.println(s3 + " " + s1);
            }else if (check.equals("1")){
                k1 = s.substring(s.length() - 1);
                d = Integer.parseInt(k1);
                s1 = tu10Den19(d);
                k3 = s.substring(s.length()-3,1);
                t = Integer.parseInt(k3);
                s3 = hangTram(t);
                System.out.println(s3 + " " + s1);
            }else {
                k1 = s.substring(s.length() - 1);
                d = Integer.parseInt(k1);
                s1 = donvi(d);
                k2 = s.substring(s.length()-2,2);
                c = Integer.parseInt(k2);
                s2 = hangChuc(c);
                k3 = s.substring(s.length()-3,1);
                t = Integer.parseInt(k3);
                s3 = hangTram(t);
                System.out.println(s3 + " " + s2 + " " + s1);
            }
        }else {
            System.out.println("Bạn chỉ được nhập tối đa 3 chữ số");
        }
    }
}
