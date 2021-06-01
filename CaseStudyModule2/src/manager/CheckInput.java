package manager;

import java.util.Scanner;

public class CheckInput {

    public static String checkIDVilla(Scanner input) {
        final String ID_REGEX ="^SVVL-[0-9]{4}$";
        String id;
        while (true) {
            System.out.println("Nhập ID");
            id = input.nextLine();
            if (!id.matches(ID_REGEX)) {
                System.err.println("mời nhập theo định dạng SVVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
            } else{
                return id;
            }
        }
    }

    public static String checkIDHouse(Scanner input) {
        final String ID_REGEX="^HOVL-[0-9]{4}$";
        String id;
        while (true) {
            System.out.println("Nhập ID");
            id = input.nextLine();
            if (!id.matches(ID_REGEX)){
                System.err.println("mời nhập theo định dạng HOVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
            }else {
                return id;
            }
        }
    }

    public static String checkIDRoom(Scanner input) {
        final String ID_REGEX="^ROVL-[0-9]{4}$";
        String id;
        while (true) {
            System.out.println("Nhập ID");
            id = input.nextLine();
            if (!id.matches(ID_REGEX)){
                System.err.println("mời nhập theo định dạng ROVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
            }else {
                return id;
            }
        }
    }


    public static String checkNameService(Scanner input) {
        final String NAME_SERVICE_REGEX = "^[A-Z][a-z]+$";
        String nameService;
        while (true) {
            System.out.println("Nhập tên dịch vụ :");
            nameService = input.nextLine();
            if (!nameService.matches(NAME_SERVICE_REGEX)){
                System.err.println(("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường"));
            }else {
                return nameService;
            }
        }
    }

    public static String checkArea(Scanner input) {
        final String AREA_REGEX = "^[3-9][1-9]+.?[0-9]+$";
        String area;
        while (true) {
            area = input.nextLine();
            if (!area.matches(AREA_REGEX)){
                System.err.println("Diện tích phải là số thực lớn hơn 30m2 - Ví dụ : 31.0");
            }else {
                return area;
            }
        }
    }

    public static String checkMaxPeople(Scanner input) {
        final String MAX_PEOPLE_REGEX = "^1[0-9]$";
        String maxPeople;
        while (true) {
            System.out.println("Nhập số lượng người tối đa :");
            maxPeople = input.nextLine();
            if (!maxPeople.matches(MAX_PEOPLE_REGEX)) {
                System.err.println("Số lượng người tối đa phải >0 và nhỏ hơn <20");
            }else {
                return maxPeople;
            }
        }
    }

    public static String checkFreeService(Scanner input) {
        final String FREE_SERVICE_REGEX = "(massage|karaoke|food|drink|car)";
        String freeService;
        while (true) {
            System.out.println("Nhập dịch vụ miễn phí đi kèm :");
            freeService = input.nextLine();
            if (!freeService.matches(FREE_SERVICE_REGEX)) {
                System.err.println("Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car");
            }else {
                return freeService;
            }
        }
    }

    public static String checkNumberFloors(Scanner input) {
        final String NUMBER_FLOORS_REGEX = "[1-9]";
        String numberFloors;
        while (true) {
            System.out.println("Nhập dịch vụ miễn phí đi kèm :");
            numberFloors = input.nextLine();
            if (!numberFloors.matches(NUMBER_FLOORS_REGEX)) {
                System.err.println("Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car");
            }else {
                return numberFloors;
            }
        }
    }
}
