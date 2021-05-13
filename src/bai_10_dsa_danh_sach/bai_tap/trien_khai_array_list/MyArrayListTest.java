package bai_10_dsa_danh_sach.bai_tap.trien_khai_array_list;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Tung");
        Student b = new Student(2, "Tuan");
        Student c = new Student(3, "Phap");
        Student d = new Student(4, "Huy");
        Student e = new Student(5, "Trang");
        Student f = new Student(6, "Dat");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f, 2);
//        System.out.println("size = " + studentMyArrayList.size());
//
//        System.out.println(studentMyArrayList.get(2).getName());
//
//        System.out.println(studentMyArrayList.indexOf(f));
//
//        System.out.println(studentMyArrayList.contains(a));

        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(1);

//        for (int i = 0; i < studentMyArrayList.size(); i++){
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }

        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }

//        Student student = newMyArrayList.remove(1);
//        System.out.println(student.getName());

    }
}
