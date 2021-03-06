package bai_17_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void displayProduct(List<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static void addProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
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
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\C0321G1_NguyenDinhSonTra_Module_2\\src\\bai_17_io_binary_file_and_serialization\\bai_tap\\quan_ly_san_pham\\data.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchProduct(List<Product> list) {
        System.out.println("Nhập tên sản phẩm muốn tìm");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            if (search.equals(list.get(i).getName())) {
                System.out.println(list.get(i).toString());
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy sản phẩm này!");
        }
    }

    public static List<Product> readFile() {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\C0321G1_NguyenDinhSonTra_Module_2\\src\\bai_17_io_binary_file_and_serialization\\bai_tap\\quan_ly_san_pham\\data.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
