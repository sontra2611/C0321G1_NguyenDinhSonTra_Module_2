package bai_19_string_and_regex.bai_tap.validate_phone_numbers;

public class PhoneNumbersTest {
    private static PhoneNumbers phoneNumbers;
    public static final String[] validPhoneNumbers =  new String[] { "(84)-(0978489648)","(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumbers = new PhoneNumbers();
        for (String numbers : validPhoneNumbers) {
            boolean isvalid = phoneNumbers.validate(numbers);
            System.out.println("PhoneNumbers is " + numbers +" is valid: "+ isvalid);
        }
    }
}
