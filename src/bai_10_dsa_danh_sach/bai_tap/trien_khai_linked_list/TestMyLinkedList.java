package bai_10_dsa_danh_sach.bai_tap.trien_khai_linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
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
        MylinkedList<Student> mylinkedList = new MylinkedList<>();
        Student student1 = new Student(1, "Tung");
        Student student2 = new Student(2, "Tuan");
        Student student3 = new Student(3, "Huy");
        Student student4 = new Student(4, "Nam");
        Student student5 = new Student(5, "Dat");

        mylinkedList.addFirst(student1);
        mylinkedList.addFirst(student2);
        mylinkedList.addLast(student3);
        mylinkedList.addLast(student4);

        mylinkedList.getFirst();
//        mylinkedList.remove(3);
//        mylinkedList.remove(student4);

        MylinkedList<Student> cloneMyLinkedList = mylinkedList.clone();
//        cloneMyLinkedList.clear();
        for (int i = 0; i < cloneMyLinkedList.size(); i++) {
            Student student = (Student) cloneMyLinkedList.get(i);
            System.out.println(student.getName());
        }

        System.out.println(cloneMyLinkedList.getFirst().getName());

        System.out.println(cloneMyLinkedList.getLast().getName());


        System.out.println(cloneMyLinkedList.constrains(student2));
        System.out.println(cloneMyLinkedList.constrains(student5));

        System.out.println(cloneMyLinkedList.indexOf(student3));
        System.out.println(cloneMyLinkedList.indexOf(student5));
    }
}
