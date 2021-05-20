package bai_12_java_collection_framework.bai_tap.chuong_trinh_quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> listProduct = new ArrayList<>();
        Product product1 = new Product(1, "Samsung", 10000000);
        Product product2 = new Product(2, "Iphone", 20000000);
        Product product3 = new Product(3, "Nokia", 3000000);
        Product product4 = new Product(4, "Oppo", 7000000);

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);

        int choice = -1;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Quản lý sản phẩm : ");
            System.out.println("1.Hiển thị danh sách sản phẩm : ");
            System.out.println("2.Thêm sản phẩm : ");
            System.out.println("3.Xoá sản phẩm : ");
            System.out.println("4.Sủa thông tin sản phẩm : ");
            System.out.println("5.Tìm kiếm sản phẩm : ");
            System.out.println("6.Sắp xếp sản phẩm tăng dần theo giá : ");
            System.out.println("7.Sắp xếp sản phẩm giảm dần theo giá : ");
            System.out.println("8.Hiển thị danh sách và thoát menu : ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayListProduct(listProduct);
                    break;
                case 2:
                    addProduct(listProduct, input);
                    break;
                case 3:
                    deleteProduct(listProduct, input);
                    break;
                case 4:
                    int id = checkIdEditProduct(listProduct, input);
                    editProduct(listProduct, input, id);
                    break;
                case 5:
                    searchProduct(listProduct, input);
                    break;
                case 6:
                    Collections.sort(listProduct, new Product());
                    displayListProduct(listProduct);
                    break;
                case 7:
                    Collections.sort(listProduct, new ComparatorByPrice());
                    displayListProduct(listProduct);
                    break;
                case 8:
                    displayListProduct(listProduct);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    private static void displayListProduct(ArrayList<Product> listProduct) {
        System.out.print("----------------");
        System.out.println();
        System.out.println("Danh sách sản phẩm :");
        for (Product p : listProduct) {
            System.out.println(p);
        }
        System.out.print("----------------");
        System.out.println();
    }

    private static void addProduct(ArrayList<Product> listProduct, Scanner input) {
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

    private static void deleteProduct(ArrayList<Product> listProduct, Scanner input) {
        System.out.println("Nhập Id sản phẩm bạn muốn xoá : ");
        int id = input.nextInt();
        listProduct.remove(id - 1);
        displayListProduct(listProduct);
    }

    private static int checkIdEditProduct(ArrayList<Product> listProduct, Scanner input) {
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

    private static void editProduct(ArrayList<Product> listProduct, Scanner input, int id) {
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

    private static void searchProduct(ArrayList<Product> listProduct, Scanner input) {
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
