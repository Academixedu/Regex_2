
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"

public static void main(String[] args) {
    String regex = "^\\d.*";
    String[] strings = {"123abc", "4you", "abc123", "you4"};

    Pattern pattern = Pattern.compile(regex);

    for (String s : strings) {
        Matcher m = pattern.matcher(s);
        if (m.matches()) {
            System.out.println(s + " matches");
        } else {
            System.out.println(s + " does not match");
        }
    }
}

}