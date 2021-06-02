package manager.manager_service;

import common.ReadAndWriteHouse;
import common.ReadAndWriteRoom;
import common.ReadAndWriteVilla;
import manager.manager_service.CheckInputService;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ManagerService {
    public void addVilla() {
        ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
        List<Villa> villaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInputService.checkIDVilla(scanner);

        String nameService = CheckInputService.checkNameService(scanner);

        System.out.println("Nhập diện tích sử dụng");
        String area = CheckInputService.checkArea(scanner);


        String rentalCost = CheckInputService.checkRentalCost(scanner);

        String maxPeople = CheckInputService.checkMaxPeople(scanner);

        String rentalType = CheckInputService.checkRentalType(scanner);

        String roomStandard = CheckInputService.checkRoomStandard(scanner);

        System.out.println("Nhập mô tả tiện nghi khác ");
        String otherAmenities = scanner.nextLine();

        System.out.println("Nhập diện tích hồ bơi : ");
        String swimmingPoolArea = CheckInputService.checkArea(scanner);

        String numberFloors = CheckInputService.checkNumberFloors(scanner);

        Villa villa = new Villa(id, nameService, area, rentalCost, maxPeople, rentalType, roomStandard, otherAmenities, swimmingPoolArea, numberFloors);
        villaList.add(villa);
        readAndWriteVilla.writeFile(villaList);
    }

    public void addHouse() {
        ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
        List<House> houseList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInputService.checkIDHouse(scanner);

        String nameService = CheckInputService.checkNameService(scanner);

        String area = scanner.nextLine();

        String rentalCost = CheckInputService.checkRentalCost(scanner);

        String maxPeople = CheckInputService.checkMaxPeople(scanner);

        String rentalType = CheckInputService.checkRentalType(scanner);

        String roomStandard = CheckInputService.checkRoomStandard(scanner);

        System.out.println("Nhập mô tả tiện nghi khác ");
        String otherAmenities = scanner.nextLine();

        String numberFloors = CheckInputService.checkNumberFloors(scanner);

        House house = new House(id, nameService, area, rentalCost, maxPeople, rentalType, roomStandard, otherAmenities, numberFloors);
        houseList.add(house);
        readAndWriteHouse.writeFile(houseList);
    }

    public void addRoom() {
        ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
        List<Room> roomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInputService.checkIDRoom(scanner);

        String nameService = CheckInputService.checkNameService(scanner);

        System.out.println("Nhập diện tích sử dụng");
        String area = CheckInputService.checkArea(scanner);

        String rentalCost = CheckInputService.checkRentalCost(scanner);

        String maxPeople = CheckInputService.checkMaxPeople(scanner);

        String rentalType = CheckInputService.checkRentalType(scanner);

        String freeService = CheckInputService.checkFreeService(scanner);

        Room room = new Room(id, nameService, area, rentalCost, maxPeople, rentalType, freeService);
        roomList.add(room);
        readAndWriteRoom.writeFile(roomList);
    }


    public void showAllVilla() {
        ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
        List<Villa> villaList = readAndWriteVilla.readFile();
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
    }

    public void showAllHouse() {
        ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
        List<House> houseList = readAndWriteHouse.readFile();
        for (House house : houseList) {
            System.out.println(house.showInfor());
        }
    }

    public void showAllRoom() {
        ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
        List<Room> roomList = readAndWriteRoom.readFile();
        for (Room room : roomList) {
            System.out.println(room.showInfor());
        }
    }

    public void showVillaNotDuplicate() {
        List<Villa> villaList = ReadAndWriteVilla.readFile();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Villa villa : villaList) {
            if (treeSet.add(villa.getServiceName())) {
                System.out.println(villa.showInfor());
            }
        }
    }

    public void showHouseNotDuplicate() {
        List<House> houseList = ReadAndWriteHouse.readFile();
        TreeSet<String> treeSet = new TreeSet<>();
        for (House house : houseList) {
            if (treeSet.add(house.getServiceName())) {
                System.out.println(house.showInfor());
            }
        }
    }

    public void showRoomNotDuplicate() {
        List<Room> roomList = ReadAndWriteRoom.readFile();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Room room : roomList) {
            if (treeSet.add(room.getServiceName())) {
                System.out.println(room.showInfor());
            }
        }
    }
}
