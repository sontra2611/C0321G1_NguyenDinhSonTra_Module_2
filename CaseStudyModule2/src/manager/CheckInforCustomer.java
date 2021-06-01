package manager;

import java.util.Scanner;

public class CheckInforCustomer {
    public String checkName(){
        System.out.println("Nhập họ và tên :");
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                UserException.nameException(name);
                return name;
            } catch (UserException e) {
                e.getMessage();
            }
        }
    }

    public String checkBirthday() {
        System.out.println("Nhập ngày tháng năm sinh :");
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                String birthday = scanner.nextLine();
                UserException.birthdayException(birthday);
                return birthday;
            } catch (UserException e) {
                e.getMessage();
            }
        }
    }

    public String checkGender() {
        System.out.println("Nhập giới tính :");
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                String gender = scanner.nextLine();
                UserException.genderException(gender);
                String newGender = gender.valueOf(gender.charAt(0)).toUpperCase();
                for (int i = 1; i < gender.length(); i++){
                    newGender += gender.valueOf(gender.charAt(i)).toLowerCase();
                }
                return newGender;
            } catch (UserException e) {
                e.getMessage();
            }
        }
    }

    public String checkIDCard() {
        System.out.println("nhập số chứng minh nhân dân :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String idCard = scanner.nextLine();
                UserException.idCardException(idCard);
                return idCard;
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
    }

    public String checkEmail() {
        System.out.println("Nhập email :");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String email = scanner.nextLine();
                UserException.emailException(email);
                return email;
            } catch (UserException e) {
                e.printStackTrace();
            }
        }
    }
}
