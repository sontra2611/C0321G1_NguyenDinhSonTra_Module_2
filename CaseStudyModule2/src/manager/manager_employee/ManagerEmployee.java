package manager.manager_employee;

import common.ReadEmployee;
import models.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ManagerEmployee {
    public static void showInforImployee(){
        List<Employee> employeeList = ReadEmployee.readFile();
        Map<String, Employee> map = new LinkedHashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            map.put(employeeList.get(i).getId(), employeeList.get(i));
        }

        for (Map.Entry<String, Employee> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }
    }
}
