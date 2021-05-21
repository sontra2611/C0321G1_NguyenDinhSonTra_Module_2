package bai_12_java_collection_framework.bai_tap.chuong_trinh_quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
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
                    ProductManager.displayListProduct(listProduct);
                    break;
                case 2:
                    ProductManager.addProduct(listProduct, input);
                    break;
                case 3:
                    ProductManager.deleteProduct(listProduct, input);
                    break;
                case 4:
                    int id = ProductManager.checkIdEditProduct(listProduct, input);
                    ProductManager.editProduct(listProduct, input, id);
                    break;
                case 5:
                    ProductManager.searchProduct(listProduct, input);
                    break;
                case 6:
                    Collections.sort(listProduct, new Product());
                    ProductManager.displayListProduct(listProduct);
                    break;
                case 7:
                    Collections.sort(listProduct, new ComparatorByPrice());
                    ProductManager.displayListProduct(listProduct);
                    break;
                case 8:
                    ProductManager.displayListProduct(listProduct);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
