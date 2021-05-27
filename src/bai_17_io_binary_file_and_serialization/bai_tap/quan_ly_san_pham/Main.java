package bai_17_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> list;
        int choice = -1;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Quản lý sản phẩm : ");
            System.out.println("1.Hiển thị danh sách sản phẩm : ");
            System.out.println("2.Thêm sản phẩm : ");
            System.out.println("3.Tìm kiếm sản phẩm : ");
            System.out.println("4.Thoát chương trình : ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    list = ProductManager.readFile();
                    productManager.displayProduct(list);
                    ;
                    break;
                case 2:
                    list = ProductManager.readFile();
                    productManager.addProduct(list);
                    break;
                case 3:
                    list = ProductManager.readFile();
                    productManager.searchProduct(list);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
