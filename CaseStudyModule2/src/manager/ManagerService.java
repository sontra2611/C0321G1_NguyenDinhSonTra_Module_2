package manager;

import common.ReadAndWriteHouse;
import common.ReadAndWriteRoom;
import common.ReadAndWriteVilla;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    public void addVilla() {
        ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
        List<Villa> villaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInput.checkIDVilla(scanner);

        String nameService = CheckInput.checkNameService(scanner);

        System.out.println("Nhập diện tích sử dụng");
        String area = CheckInput.checkArea(scanner);


        String rentalCost = CheckInput.checkRentalCost(scanner);

        String maxPeople = CheckInput.checkMaxPeople(scanner);

        String rentalType = CheckInput.checkRentalType(scanner);

        String roomStandard = CheckInput.checkRoomStandard(scanner);

        System.out.println("Nhập mô tả tiện nghi khác ");
        String otherAmenities = scanner.nextLine();

        System.out.println("Nhập diện tích hồ bơi : ");
        String swimmingPoolArea = CheckInput.checkArea(scanner);

        String numberFloors = CheckInput.checkNumberFloors(scanner);

        Villa villa = new Villa(id, nameService, area, rentalCost, maxPeople, rentalType, roomStandard, otherAmenities, swimmingPoolArea, numberFloors);
        villaList.add(villa);
        readAndWriteVilla.writeFile(villaList);
    }

    public void addHouse() {
        ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
        List<House> houseList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInput.checkIDHouse(scanner);

        String nameService = CheckInput.checkNameService(scanner);

        String area = scanner.nextLine();

        String rentalCost = CheckInput.checkRentalCost(scanner);

        String maxPeople = CheckInput.checkMaxPeople(scanner);

        String rentalType = CheckInput.checkRentalType(scanner);

        String roomStandard = CheckInput.checkRoomStandard(scanner);

        System.out.println("Nhập mô tả tiện nghi khác ");
        String otherAmenities = scanner.nextLine();

        String numberFloors = CheckInput.checkNumberFloors(scanner);

        House house = new House(id, nameService, area, rentalCost, maxPeople, rentalType, roomStandard, otherAmenities, numberFloors);
        houseList.add(house);
        readAndWriteHouse.writeFile(houseList);
    }

    public void addRoom() {
        ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
        List<Room> roomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInput.checkIDRoom(scanner);

        String nameService = CheckInput.checkNameService(scanner);

        System.out.println("Nhập diện tích sử dụng");
        String area = CheckInput.checkArea(scanner);

        String rentalCost = CheckInput.checkRentalCost(scanner);

        String maxPeople = CheckInput.checkMaxPeople(scanner);

        String rentalType = CheckInput.checkRentalType(scanner);

        String freeService = CheckInput.checkFreeService(scanner);

        Room room = new Room(id, nameService, area, rentalCost, maxPeople, rentalType, freeService);
        roomList.add(room);
        readAndWriteRoom.writeFile(roomList);
    }


    public void displayAllVilla() {
        ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
        List<Villa> villaList = readAndWriteVilla.readFile();
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
    }

    public void displayAllHouse() {
        ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
        List<House> houseList = readAndWriteHouse.readFile();
        for (House house : houseList) {
            System.out.println(house.showInfor());
        }
    }

    public void displayAllRoom() {
        ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
        List<Room> roomList = readAndWriteRoom.readFile();
        for (Room room : roomList) {
            System.out.println(room.showInfor());
        }
    }
}
