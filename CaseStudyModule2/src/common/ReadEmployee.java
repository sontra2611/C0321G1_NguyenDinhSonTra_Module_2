package common;

import models.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadEmployee {
    public static List<Employee> readFile() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("D:\\C0321G1_NguyenDinhSonTra_Module_2\\CaseStudyModule2\\src\\data\\employee.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Employee employee = new Employee(strings[0], strings[1], strings[2]);
                employeeList.add(employee);
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
        return employeeList;
    }
}
