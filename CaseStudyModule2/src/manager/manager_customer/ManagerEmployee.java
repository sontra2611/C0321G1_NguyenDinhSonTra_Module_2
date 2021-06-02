package manager.manager_customer;

import common.ReadEmployee;
import models.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ManagerEmployee {
    public static void showInforImployee(){
        List<Employee> employeeList = ReadEmployee.readFile();
        Map<String, Employee> map = new LinkedHashMap<>();
        for (int i = 0; i < employeeList.size(); i++){
            map.put("00"+(i+1) , employeeList.get(i));
        }

        for (Map.Entry<String, Employee> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }
    }
}
