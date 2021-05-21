package bai_12_java_collection_framework.bai_tap.chuong_trinh_quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public static void displayListProduct(ArrayList<Product> listProduct) {
        System.out.print("----------------");
        System.out.println();
        System.out.println("Danh sách sản phẩm :");
        for (Product p : listProduct) {
            System.out.println(p);
        }
        System.out.print("----------------");
        System.out.println();
    }

    public static void addProduct(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập Id :");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();
        System.out.println("Nhập giá");
        int price = input.nextInt();
        Product product5 = new Product(id, name, price);
        listProduct.add(product5);
        displayListProduct(listProduct);
    }

    public static void deleteProduct(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập Id sản phẩm bạn muốn xoá : ");
        int id = input.nextInt();
        System.out.println("Bạn có chắc chắn muốn xoá ?");
        System.out.println("1.có \n2.không");
        int option = input.nextInt();
        if (option == 1) {
            listProduct.remove(id - 1);
        }else {
            System.out.println("Xoá không thành công");
        }
        displayListProduct(listProduct);
    }

    public static int checkIdEditProduct(ArrayList<Product> listProduct, Scanner input) {
        boolean flag = false;
        int id = 0;
        while (!flag) {
            System.out.println("Nhập Id sản phẩm bạn muốn sửa : ");
            id = input.nextInt();
            for (Product p : listProduct) {
                if (id != p.getId()) {
                    flag = false;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Id sản phẩm k tồn tại, vui lòng nhập lại");
            }
        }
        return id;
    }

    public static void editProduct(ArrayList<Product> listProduct, Scanner input, int id) {
        boolean check = true;
        while (check) {
            System.out.println("Chọn thông tin bạn muốn sửa : ");
            System.out.println("1.id: ");
            System.out.println("2.name: ");
            System.out.println("3.price: ");
            System.out.println("4.Exit: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Nhập id bạn muốn thay đổi :");
                    int editId = input.nextInt();
                    listProduct.get(id - 1).setId(editId);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Nhập tên bạn muốn thay đổi :");
                    String name = input.nextLine();
                    listProduct.get(id - 1).setNameProduct(name);
                    break;
                case 3:
                    System.out.println("Nhập giá bạn muốn thay đổi :");
                    int price = input.nextInt();
                    listProduct.get(id - 1).setPrice(price);
                    break;
                case 4:
                    check = false;
                    displayListProduct(listProduct);
                    break;
            }
        }
    }

    public static void searchProduct(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        String name = input.nextLine();
        boolean flag = false;
        for (Product p : listProduct) {
            if (name.equals(p.getNameProduct())) {
                flag = true;
                System.out.println(p);
                break;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("Sản phẩm k có trog danh sách");
        }
    }
}
