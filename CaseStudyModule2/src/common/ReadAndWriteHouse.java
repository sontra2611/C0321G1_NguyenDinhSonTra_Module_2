package common;

import models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteHouse {
    public static List<House> readFile() {
        List<House> houseList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\house.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("#");
                House house = new House(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6],strings[7],strings[8]);
                houseList.add(house);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }finally {
            try{
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return houseList;
    }

    public static void writeFile(List<House> houseList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\room.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : houseList) {
                bufferedWriter.write(house.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
