package controllers;

import manager.ManagerBooking;
import manager.ManagerCustomers;
import manager.ManagerService;

import java.util.Scanner;

public class Controllers {
    ManagerService managerService = new ManagerService();
    ManagerCustomers managerCustomers = new ManagerCustomers();
    ManagerBooking managerBooking = new ManagerBooking();
    public void displayMainMenu() {
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
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (check);
    }

    public void addService() {
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
                    managerService.addVilla();
                    break;
                case 2:
                    managerService.addHouse();
                    break;
                case 3:
                    managerService.addRoom();
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (check);
    }

    public void showService(){
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
                    managerService.displayAllVilla();
                    break;
                case 2:
                    managerService.displayAllHouse();
                    break;
                case 3:
                    managerService.displayAllRoom();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("No choice");
            }
        } while (check);
    }

    public static void main(String[] args) {
        Controllers controllers = new Controllers();
        controllers.displayMainMenu();
    }
}
