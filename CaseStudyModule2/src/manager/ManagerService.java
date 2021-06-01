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
//    public void checkIDVilla(String id) throws CheckInput {
//
//    }
    public void addVilla() {
        ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
        List<Villa> villaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String id = CheckInput.checkIDVilla(scanner);

        System.out.println("Nhập tên dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        String area = scanner.nextLine();
        System.out.println("Nhập giá cho thuê :");
        String rentalCost = scanner.nextLine();
        System.out.println("Nhập số lượng người tối đa :");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê : ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng :");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập mô tả tiện nghi khác ");
        String otherAmenities = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi : ");
        String swimmingPoolArea = scanner.nextLine();
        System.out.println("Nhập số tầng : ");
        String numberFloors = scanner.nextLine();

        Villa villa = new Villa(id,nameService,area,rentalCost,maxPeople,rentalType,roomStandard,otherAmenities,swimmingPoolArea,numberFloors);
        villaList.add(villa);
        readAndWriteVilla.writeFile(villaList);
    }

    public void addHouse() {
        ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
        List<House> houseList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID :");
        String id = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        String area = scanner.nextLine();
        System.out.println("Nhập giá cho thuê :");
        String rentalCost = scanner.nextLine();
        System.out.println("Nhập số lượng người tối đa :");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê : ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng :");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhập mô tả tiện nghi khác ");
        String otherAmenities = scanner.nextLine();
        System.out.println("Nhập số tầng : ");
        String numberFloors = scanner.nextLine();

        House house = new House(id,nameService,area,rentalCost,maxPeople,rentalType,roomStandard,otherAmenities,numberFloors);
        houseList.add(house);
        readAndWriteHouse.writeFile(houseList);
    }

    public void addRoom() {
        ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
        List<Room> roomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID :");
        String id = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameService = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        String area = scanner.nextLine();
        System.out.println("Nhập giá cho thuê :");
        String rentalCost = scanner.nextLine();
        System.out.println("Nhập số lượng người tối đa :");
        String maxPeople = scanner.nextLine();
        System.out.println("Nhập kiểu thuê : ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí đi kèm:");
        String freeService = scanner.nextLine();

        Room room = new Room(id,nameService,area,rentalCost,maxPeople,rentalType,freeService);
        roomList.add(room);
        readAndWriteRoom.writeFile(roomList);
    }


    public void displayAllVilla(){
        ReadAndWriteVilla readAndWriteVilla = new ReadAndWriteVilla();
        List<Villa> villaList = readAndWriteVilla.readFile();
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
    }

    public void displayAllHouse(){
        ReadAndWriteHouse readAndWriteHouse = new ReadAndWriteHouse();
        List<House> houseList = readAndWriteHouse.readFile();
        for (House house : houseList) {
            System.out.println(house.showInfor());
        }
    }

    public void displayAllRoom(){
        ReadAndWriteRoom readAndWriteRoom = new ReadAndWriteRoom();
        List<Room> roomList = readAndWriteRoom.readFile();
        for (Room room : roomList) {
            System.out.println(room.showInfor());
        }
    }
}
