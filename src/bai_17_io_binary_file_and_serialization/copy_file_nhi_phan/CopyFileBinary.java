package bai_17_io_binary_file_and_serialization.copy_file_nhi_phan;

import java.io.*;

public class CopyFileBinary {
    public static void copyFile(String inStream, String outStream) throws IOException {
        File file = new File(outStream);
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {

            if (file.exists()){
                System.err.println("File đích đã tồn tại");
            }

            bufferedInputStream = new BufferedInputStream(new FileInputStream(inStream));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));

            int character;
            int count = 0;

            while ((character = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(character);
                count++;
            }
            System.out.println("Số byte trong tệp là : " + count);
        } catch (Exception e) {
            System.err.println("File nguồn không tồn tại");
        }finally {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }
    }
}
