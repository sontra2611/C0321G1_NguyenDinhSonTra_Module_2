package bai_16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void copyFile(String inStream, String outStream) {
        try {
            File file = new File(outStream);

            if (file.exists()){
                System.err.println("File đích đã tồn tại");
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(inStream));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("File nguồn không tồn tại");
        }
    }
}
