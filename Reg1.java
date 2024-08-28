import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
    public static void main(String[] args) {
        String regex = "^\\d{3}[- ]?\\d{3}[- ]?\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        String[] phoneNumbers = {
            "123-456-7890",
            "123 456 7890",
            "1234567890",
            "12-3456-7890",
            "123-45-67890"
        };
        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) {
                System.out.println(phoneNumber + " given no  is valid.");
            } else {
                System.out.println(phoneNumber + " given no is invalid.");
            }
        }
    }
}


