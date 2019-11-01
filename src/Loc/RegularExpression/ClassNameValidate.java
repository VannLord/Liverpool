package Loc.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[ACP]+[0-9]{4}[GHIKLM]+$";
    public ClassNameValidate() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
