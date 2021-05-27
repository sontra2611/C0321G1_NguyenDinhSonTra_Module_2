package bai_17_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham;


import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
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
                    productManager.displayProduct();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.searchProduct();
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
