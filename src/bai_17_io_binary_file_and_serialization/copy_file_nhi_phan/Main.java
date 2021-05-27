package bai_17_io_binary_file_and_serialization.copy_file_nhi_phan;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file nguồn : ");
        String inStream = scanner.nextLine();
        System.out.println("Nhập đường dẫn file đích : ");
        String outStream = scanner.nextLine();
        CopyFileBinary.copyFile(inStream, outStream);
    }
}
