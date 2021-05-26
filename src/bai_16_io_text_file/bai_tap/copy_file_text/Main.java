package bai_16_io_text_file.bai_tap.copy_file_text;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file nguồn : ");
        String inStream = scanner.nextLine();
        System.out.println("Nhập đường dẫn file đích : ");
        String outStream = scanner.nextLine();
        CopyFile.copyFile(inStream, outStream);
    }
}
