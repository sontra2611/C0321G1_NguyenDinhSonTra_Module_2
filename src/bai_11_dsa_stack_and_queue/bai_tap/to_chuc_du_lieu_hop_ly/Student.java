package bai_11_dsa_stack_and_queue.bai_tap.to_chuc_du_lieu_hop_ly;

public class Student implements Comparable<Student> {
    private String name;
    private String gender;
    private String birthday;

    public Student() {
    }

    public Student(String name,String gender,String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday=birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.getGender().compareTo(o.getGender());
    }
}