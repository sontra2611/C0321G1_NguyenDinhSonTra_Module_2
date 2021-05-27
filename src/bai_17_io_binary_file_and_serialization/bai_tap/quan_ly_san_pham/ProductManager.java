package bai_17_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.println("nhập id sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm :");
        String name = scanner.nextLine();
        System.out.println("nhập hãng sản xuất sản phẩm : ");
        String manufacturer = scanner.nextLine();
        System.out.println("nhập giá sản phẩm : ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập mô tả sản phẩm : ");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, manufacturer, price, describe);
        list.add(product);
        System.out.println(list);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\C0321G1_NguyenDinhSonTra_Module_2\\src\\bai_17_io_binary_file_and_serialization\\bai_tap\\quan_ly_san_pham\\data.data");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            System.out.println("file was created successfully !");
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayProduct(){

    }

    public void searchProduct(){

    }
}
