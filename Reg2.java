import java.util.regex.Pattern;
public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void main(String[] args) {
    String regex = "^\\d";
    Pattern pattern = Pattern.compile(regex);
    String[] testStrings = {"123abc", "4you", "abc123", "you4"};

    for (String str : testStrings) {
        if (pattern.matcher(str).find()) {
            System.out.println(str + " matches.");
        } else {
            System.out.println(str + " doesn't match.");
        }
    }
}
}