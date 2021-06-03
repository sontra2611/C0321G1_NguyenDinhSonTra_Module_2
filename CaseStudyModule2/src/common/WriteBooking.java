package common;

import models.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBooking {
    public static void writeFile(String string) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\booking.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
