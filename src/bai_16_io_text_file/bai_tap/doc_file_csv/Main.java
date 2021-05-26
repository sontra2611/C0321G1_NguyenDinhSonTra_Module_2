package bai_16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\bai_16_io_text_file\\bai_tap\\doc_file_csv\\country.csv"));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Country country = new Country(Integer.parseInt(strings[0]), strings[1], strings[2]);
                System.out.println(country);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
