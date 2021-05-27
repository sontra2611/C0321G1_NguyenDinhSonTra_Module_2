package bai_19_string_and_regex.bai_tap.validate_phone_numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {
    private static final String PHONE_NUMBERS = "^\\([0-9]{2}\\)-\\([0][0-9]{9}\\)$";

    public PhoneNumbers() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBERS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
