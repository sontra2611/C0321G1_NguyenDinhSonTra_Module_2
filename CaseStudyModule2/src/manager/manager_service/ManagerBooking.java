package manager.manager_service;

import common.*;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.List;
import java.util.Scanner;

public class ManagerBooking {
    String string = "";

    public void addBooking() {
        ManagerService managerService = new ManagerService();

        List<Customer> customerList = ReadAndWriteCustomer.readFile();

        System.out.println("---------------");
        System.out.println("Danh sách khách hàng");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + "." + customerList.get(i).showInfor());
        }
        System.out.println("----------------");

        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println("Vui lòng lựa chọn khách hàng theo số thứ tự :");
        do {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > customerList.size()) {
                System.out.println("Không có số thứ tự này trong danh sách, vui lòng nhập lại :");
            } else {
                System.out.println("Bạn đã chọn khách hàng với số thứ tự là " + choice + ":");
                System.out.println("---------------");
                System.out.println("Thông tin khách hàng :");
                System.out.println(customerList.get(choice - 1).showInfor());
                System.out.println("---------------");
                string += customerList.get(choice - 1).getName() + ",";
                check = false;
            }
        } while (check);

        while (true) {
            System.out.println("Vui lòng Booking dịch vụ :");
            System.out.println("1.Booking Villa\n" +
                    "2.Booking House\n" +
                    "3.Booking Room");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookingVilla(managerService, scanner);
                    return;
                case 2:
                    bookingHouse(managerService, scanner);
                    return;
                case 3:
                    bookingRoom(managerService, scanner);
                    return;
                default:
                    System.out.println("Không có lựa chọn này, vui lòng nhập lại :");
            }
        }
    }

    private void bookingVilla(ManagerService managerService, Scanner scanner) {
        managerService.showAllVilla();
        List<Villa> villaList = ReadAndWriteVilla.readFile();
        while (true) {
            System.out.println("Nhập id villa:");
            String id = scanner.nextLine();
            for (int i = 0; i < villaList.size(); i++) {
                if (id.equals(villaList.get(i).getId())) {
                    System.out.println("Dịch vụ Villa bạn đã chọn là :");
                    System.out.println(villaList.get(i).showInfor());
                    string += villaList.get(i).getId();
                    WriteBooking.writeFile(string);
                    string = "";
                    return;
                }
            }
            System.out.println("Không có dịch vụ này, vui lòng nhập lại");
        }
    }

    private void bookingHouse(ManagerService managerService, Scanner scanner) {
        managerService.showAllHouse();
        List<House> houseList = ReadAndWriteHouse.readFile();
        while (true) {
            System.out.println("Nhập id House:");
            String id = scanner.nextLine();
            for (int i = 0; i < houseList.size(); i++) {
                if (id.equals(houseList.get(i).getId())) {
                    System.out.println("Dịch vụ House bạn đã chọn là :");
                    System.out.println(houseList.get(i).showInfor());
                    string += houseList.get(i).getId();
                    WriteBooking.writeFile(string);
                    string = "";
                    return;
                }
            }
            System.out.println("Không có dịch vụ này, vui lòng nhập lại");
        }
    }

    private void bookingRoom(ManagerService managerService, Scanner scanner) {
        managerService.showAllRoom();
        List<Room> roomList = ReadAndWriteRoom.readFile();
        while (true) {
            System.out.println("Nhập id Room:");
            String id = scanner.nextLine();
            for (int i = 0; i < roomList.size(); i++) {
                if (id.equals(roomList.get(i).getId())) {
                    System.out.println("Dịch vụ Room bạn đã chọn là :");
                    System.out.println(roomList.get(i).showInfor());
                    string += roomList.get(i).getId();
                    WriteBooking.writeFile(string);
                    string = "";
                    return;
                }
            }
            System.out.println("Không có dịch vụ này, vui lòng nhập lại");
        }
    }
}
