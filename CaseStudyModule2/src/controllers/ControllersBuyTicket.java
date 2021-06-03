package controllers;

import manager.BuyTicket;

import java.util.Scanner;

public class ControllersBuyTicket {
    public static void displayMainMenu() {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1.BuyTicker\n" +
                    "2.Hiển thị danh sách khách hàng đã mua vé hôm nay\n" +
                    "3.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BuyTicket.buyTicket();
                    break;
                case 2:
                    BuyTicket.showCustomerBuyTicket();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
