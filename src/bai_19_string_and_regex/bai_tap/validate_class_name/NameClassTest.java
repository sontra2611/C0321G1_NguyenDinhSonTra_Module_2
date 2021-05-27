package bai_19_string_and_regex.bai_tap.validate_class_name;

public class NameClassTest {
    private static NameClass nameClass;
    public static final String[] validNameClass =  new String[] { "C0321G","M0318G",  "P0323A", "A0320K"};

    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String name : validNameClass) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Class is " + name +" is valid: "+ isvalid);
        }
    }
}
