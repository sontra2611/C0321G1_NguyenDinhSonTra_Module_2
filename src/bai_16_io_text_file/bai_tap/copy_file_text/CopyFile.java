package bai_16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void copyFile(String inStream, String outStream) throws IOException {
        File file = new File(outStream);
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            if (file.exists()){
                System.err.println("File đích đã tồn tại");
            }

            bufferedReader = new BufferedReader(new FileReader(inStream));
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.err.println("File nguồn không tồn tại");
        }finally {
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
