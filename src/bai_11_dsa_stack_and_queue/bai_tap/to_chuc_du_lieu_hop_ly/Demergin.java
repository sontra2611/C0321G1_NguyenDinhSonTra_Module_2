package bai_11_dsa_stack_and_queue.bai_tap.to_chuc_du_lieu_hop_ly;

import java.util.*;

public class Demergin {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tra","nam","1997"));
        list.add(new Student("Nhung","nu","1995"));
        list.add(new Student("Thuy","nu","1996"));
        list.add(new Student("Phap","nam","1999"));
        list.add(new Student("Dung","nam","1998"));

        Collections.sort(list);
        
        Queue<Student> nu = new ArrayDeque<>();
        Queue<Student> nam = new ArrayDeque<>();
        for (Student student : list) {
            if (student.getGender().equals("nu")) {
                nu.add(student);
            } else nam.add(student);
        }

        Queue<Student> outPut = new ArrayDeque<>();

        while (!nu.isEmpty()) {
            outPut.add(nu.poll());
        }

        while (!nam.isEmpty()) {
            outPut.add(nam.poll());
        }

        for (Student student : outPut) {
            System.out.println(student);
        }
    }
}
