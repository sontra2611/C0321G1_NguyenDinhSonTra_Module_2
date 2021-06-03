package manager.manager_customer;

import manager.exception.CustomerException;

import java.util.Scanner;

public class CheckInforCustomer {
    public static String checkName() {
        System.out.println("Nhập họ và tên :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                ValidateCustomer.nameException(name);
                return name;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String checkBirthday() {
        System.out.println("Nhập ngày tháng năm sinh :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String birthday = scanner.nextLine();
                ValidateCustomer.birthdayException(birthday);
                return birthday;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String checkGender() {
        System.out.println("Nhập giới tính :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String gender = scanner.nextLine();
                ValidateCustomer.genderException(gender);
                String newGender = gender.valueOf(gender.charAt(0)).toUpperCase();
                for (int i = 1; i < gender.length(); i++) {
                    newGender += gender.valueOf(gender.charAt(i)).toLowerCase();
                }
                return newGender;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String checkIDCard() {
        System.out.println("nhập số chứng minh nhân dân :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String idCard = scanner.nextLine();
                ValidateCustomer.idCardException(idCard);
                return idCard;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String checkEmail() {
        System.out.println("Nhập email :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String email = scanner.nextLine();
                ValidateCustomer.emailException(email);
                return email;
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
