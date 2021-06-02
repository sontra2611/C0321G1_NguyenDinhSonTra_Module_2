package controllers;

import manager.manager_customer.ManagerEmployee;
import manager.manager_service.ManagerBooking;
import manager.manager_customer.ManagerCustomers;
import manager.manager_service.ManagerService;

import java.util.Scanner;

public class Controllers {
    public static void displayMainMenu() {
        ManagerCustomers managerCustomers = new ManagerCustomers();
        ManagerBooking managerBooking = new ManagerBooking();
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1.Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    managerCustomers.addCustomer();
                    break;
                case 4:
                    managerCustomers.showInforCustomer();
                    break;
                case 5:
                    managerBooking.addBooking();
                    break;
                case 6:
                    ManagerEmployee.showInforImployee();
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (check);
    }

    public static void addService() {
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ManagerService.addVilla();
                    break;
                case 2:
                    ManagerService.addHouse();
                    break;
                case 3:
                    ManagerService.addRoom();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (check);
    }

    public static void showService() {
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1.Show All Villa\n" +
                    "2.Show All House\n" +
                    "3.Show All Room\n" +
                    "4.Show All Name Villa Not Duplicate\n" +
                    "5.Show All Name House Not Duplicate\n" +
                    "6.Show All Name Room Not Duplicate\n" +
                    "7.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ManagerService.showAllVilla();
                    break;
                case 2:
                    ManagerService.showAllHouse();
                    break;
                case 3:
                    ManagerService.showAllRoom();
                    break;
                case 4:
                    ManagerService.showVillaNotDuplicate();
                    break;
                case 5:
                    ManagerService.showHouseNotDuplicate();
                    break;
                case 6:
                    ManagerService.showRoomNotDuplicate();
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (check);
    }
}
