package models;

import common.ReadEmployee;

import java.util.*;

public class Cabinet {
    private static Stack<Employee> stack = new Stack<>();

    private static Employee getFileOfEmployee(String id) {
        List<Employee> employeeList = ReadEmployee.readFile();

        for (int i = 0; i < employeeList.size(); i++) {
            stack.push(employeeList.get(i));
        }

        Employee employee = null;

        while (!stack.isEmpty()) {
            employee = stack.pop();

            if ((employee.getId()).equals(id)) {
                return employee;
            }
            employee = null;
        }

        return employee;
    }

    public static void findFileOfEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập mã id nhân viên của bạn :");
        String id = scanner.nextLine();

        Employee employee = getFileOfEmployee(id);

        if (employee != null) {
            System.out.println("Thông tin nhân viên của bạn là :" + employee);
        } else {
            System.out.println("không tìm thấy bạn");
        }
    }
}
