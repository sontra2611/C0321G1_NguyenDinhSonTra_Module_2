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
                System.err.println("Vui lòng nhập theo định dạng SVVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
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
                System.err.println("Vui lòng nhập theo định dạng HOVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
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
                System.err.println("Vui lòng nhập theo định dạng ROVL-XXXX (XXXX là ký tự số gồm 4 chũ số)");
            }else {
                return id;
            }
        }
    }


    public static String checkNameService(Scanner input) {
        final String NAME_SERVICE_REGEX = "^[A-Z][a-z 0-9]+$";
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
        String area;
        while (true) {
            area = input.nextLine();
            if (Double.parseDouble(area) < 30){
                System.err.println("Diện tích phải lớn hơn 30m2");
            }else {
                return area;
            }
        }
    }

    public static String checkRentalCost(Scanner input) {
        String rentalCost;
        while (true) {
            System.out.println("Nhập giá cho thuê:");
            rentalCost = input.nextLine();
            if (Integer.parseInt(rentalCost) < 1) {
                System.err.println("Giá cho thuê phải > 0");
            }else {
                return rentalCost;
            }
        }
    }

    public static String checkMaxPeople(Scanner input) {
        String maxPeople;
        while (true) {
            System.out.println("Nhập số lượng người tối đa :");
            maxPeople = input.nextLine();
            if (Integer.parseInt(maxPeople) < 1 || Integer.parseInt(maxPeople) > 20) {
                System.err.println("Số lượng người tối đa phải > 0 và nhỏ hơn < 20");
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
        String numberFloors;
        while (true) {
            System.out.println("Nhập số tầng :");
            numberFloors = input.nextLine();
            if (Integer.parseInt(numberFloors) < 1) {
                System.err.println("số tầng phải > 0");
            }else {
                return numberFloors;
            }
        }
    }

    public static String checkRentalType(Scanner input) {
        final String RENTAL_TYPE_REGEX = "^[A-Z][a-z 0-9]+";
        String rentalTyle;
        while (true) {
            System.out.println("Nhập vào kiểu thuê : ");
            rentalTyle = input.nextLine();
            if (!rentalTyle.matches(RENTAL_TYPE_REGEX)) {
                System.err.println("Vui lòng viết hoa ký tự đầu tiên");
            }else {
                return rentalTyle;
            }
        }
    }

    public static String checkRoomStandard(Scanner input) {
        final String ROOM_STANDARD_REGEX = "^[A-Z][a-z 0-9]+";
        String roomStandard;
        while (true) {
            System.out.println("Nhập vào tiêu chuẩn phòng : ");
            roomStandard = input.nextLine();
            if (!roomStandard.matches(ROOM_STANDARD_REGEX)) {
                System.err.println("Vui lòng viết hoa ký tự đầu tiên");
            }else {
                return roomStandard;
            }
        }
    }

}
