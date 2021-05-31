package controllers;

import manager.ManagerService;

import java.util.Scanner;

public class Controllers {
    ManagerService managerService = new ManagerService();
    public void displayMainMenu() {
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1.Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.New Booking\n" +
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
                    //add customer
                    break;
                case 4:
                    //Show info Customer
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

    public void addService() {
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1.Add New Villa\n" +
                    "2.Add New Room\n" +
                    "3.Add New House\n" +
                    "4.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    managerService.addVilla();
                    break;
                case 2:
                    managerService.addRoom();
                    break;
                case 3:
                    managerService.addHouse();
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
            System.out.println("1.Show Villa\n" +
                    "2.Show Room\n" +
                    "3.Show House\n" +
                    "4.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    managerService.displayVilla();
                    break;
                case 2:
                    managerService.displayRoom();
                    break;
                case 3:
                    managerService.displayHouse();
                    break;
                case 4:
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
