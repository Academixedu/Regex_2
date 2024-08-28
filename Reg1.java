import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890

public static void main(String[] args) {
    String regex = "^(\\d{10}|(\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4}))$";
    String[] phoneNumbers = {"123-456-7890","123 456 7890","1234567890","12-3456-7890","123-45-67890"};

    Pattern p= Pattern.compile(regex);

    for (String s : phoneNumbers) {
        Matcher m = p.matcher(s);
        if (m.matches()) {
            System.out.println(s+" Valid");
        } else {
            System.out.println(s + " Invalid");
        }
    }
}
}


