package manager;

import common.ReadAndWriteCustomer;
import models.Customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomers {
    public void addCustomer(){
        ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();
        List<Customer> customerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name = CheckInforCustomer.checkName();

        String birthday = CheckInforCustomer.checkBirthday();

        String gender = CheckInforCustomer.checkGender();

        String idCard = CheckInforCustomer.checkIDCard();

        System.out.println("Nhập số điện thoại :");
        String phoneNumer = scanner.nextLine();

        String email = CheckInforCustomer.checkEmail();

        System.out.println("Nhập loại khách hàng :");
        String typeCustomer = scanner.nextLine();

        System.out.println("Nhập địa chỉ : ");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, birthday, gender, idCard, phoneNumer, email,typeCustomer, address);
        customerList.add(customer);
        readAndWriteCustomer.writeFile(customerList);
    }

    public void showInforCustomer(){
        ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();
        List<Customer> customerList = readAndWriteCustomer.readFile();
        Collections.sort(customerList, new sortByName());
        for (Customer customer : customerList) {
            System.out.println(customer.showInfor());
        }
    }
}
