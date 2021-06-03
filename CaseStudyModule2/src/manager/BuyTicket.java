package manager;

import common.ReadAndWriteCustomer;
import controllers.ControllersBuyTicket;
import models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BuyTicket {
    static int count = 10;
    static Queue<String> queue = new LinkedList<>();

    public static void buyTicket() {
        List<Customer> customerList = ReadAndWriteCustomer.readFile();
        String string = "";
        System.out.println("---------------");
        System.out.println("Danh sách khách hàng");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + "." + customerList.get(i).showInfor());
        }
        System.out.println("----------------");
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        System.out.println("Chọn tên bạn theo số thứ tự :");
        do {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > customerList.size()) {
                System.out.println("Không có số thứ tự này trong danh sách, vui lòng nhập lại :");
            } else {
                System.out.println("Bạn là khách hàng với số thứ tự là " + choice + ":");
                System.out.println("---------------");
                System.out.println("Thông tin khách hàng :");
                System.out.println(customerList.get(choice - 1).showInfor());
                System.out.println("---------------");
                string += customerList.get(choice - 1).getName();
                check = false;
            }
        } while (check);

        while (true) {
            System.out.println("Số vé hôm nay còn " + count + " vé,mời bạn nhập số vé muốn mua");
            int buyTicket = Integer.parseInt(scanner.nextLine());
            if (count == 0) {
                System.out.println("hết vé,hẹn gặp lại bạn sau :");
                break;
            } else if (buyTicket < 0) {
                System.out.println("vui lòng mua 1 vé trở lên");
            } else if (buyTicket > count) {
                System.out.println("số vé bạn muốn mua vượt quá số vé còn hôm nay,bạn có muốn mua lại ?");
                System.out.println("1.có\n2.không");
                int option = Integer.parseInt(scanner.nextLine());
                if (option != 1) {
                    string = "";
                    break;
                }
            } else {
                System.out.println("Bạn đã mua thành công " + buyTicket + "vé");
                string += " đã mua " + buyTicket + " vé";
                count -= buyTicket;
                queue.add(string);
                break;
            }
        }
    }

    public static void showCustomerBuyTicket() {
        int length = queue.size();
        for (int i = 0; i < length; i++) {
            System.out.println(queue.remove());
        }
    }
}
