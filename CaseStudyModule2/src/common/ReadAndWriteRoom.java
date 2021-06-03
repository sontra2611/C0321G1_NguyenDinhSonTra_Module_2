package common;

import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteRoom {
    public static List<Room> readFile() {
        List<Room> roomList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\room.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("#");
                Room room = new Room(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6]);
                roomList.add(room);
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomList;
    }

    public static void writeFile(List<Room> roomList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\room.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : roomList) {
                bufferedWriter.write(room.toString());
                bufferedWriter.newLine();
            }
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
