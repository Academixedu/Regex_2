import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"

    public static void main(String[] args) {

        String string_digit_partten = "^\\d.*";
        Pattern pattern = Pattern.compile(string_digit_partten);
        Matcher matcher = pattern.matcher("123abc ,4you");
        if (matcher.matches()) {
            System.out.println("digit matched");
        } else {
            System.out.println("digit not matched");
        }
    }
}
