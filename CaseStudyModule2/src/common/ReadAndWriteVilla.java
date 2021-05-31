package common;

import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteVilla {
    public List<Villa> readFile() {
        List<Villa> villaList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("#");
                Villa villa = new Villa(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7], strings[8], strings[9]);
                villaList.add(villa);
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
        return villaList;
    }

    public void writeFile(List<Villa> villaList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\villa.csv",true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : villaList) {
                bufferedWriter.write(villa.toString());
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
