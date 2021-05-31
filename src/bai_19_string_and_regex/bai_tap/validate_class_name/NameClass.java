package bai_19_string_and_regex.bai_tap.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public NameClass() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
